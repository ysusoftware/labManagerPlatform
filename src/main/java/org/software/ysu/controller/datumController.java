package org.software.ysu.controller;

import org.software.ysu.pojo.*;
import org.software.ysu.service.Interface.IDatumService;
import org.software.ysu.service.Interface.ISubjectService;
import org.software.ysu.service.Interface.IUserService;
import org.software.ysu.utils.DESUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Erisu
 * @date 2019/1/5 9:58
 * @Description 内部交流资料管理controller
 * @Version 1.0
 **/
@RequestMapping("datum")
@RestController
public class datumController {
    @Resource
    IDatumService datumService;
    @Resource
    IUserService userService;
    @Resource
    ISubjectService subjectService;
    @RequestMapping("datumUpload.do")
    public layuiResponse uploadPic(@RequestParam(value = "file") MultipartFile datumFile) {
        String fileUrl = fileController.uploadFile("datumFile", datumFile);
        layuiResponse layuiResponse = new layuiResponse("0", "", fileUrl);
        return layuiResponse;
    }
    @RequestMapping("datumDel.do")
    public String delDatum(Integer datumId){
        Datum datum=datumService.getDatum(datumId);
        fileController.delFile(datum.getDatumNewname());
        datumService.delDatum(datumId);
        return "success";
    }
    @RequestMapping("datumAdd.do")
    public String addDatum(Datum datum,HttpServletRequest request){
        //对于userAccount的解码与存储
        String labUserCookie=request.getParameter("labUserCookie");
        String baseAccount=DESUtils.decode(labUserCookie.substring(1,labUserCookie.length()-1));
        baseAccount=baseAccount.substring(0,baseAccount.length()-5);
        //subject存储
        SubjectExample subjectExample=new SubjectExample();
        subjectExample.createCriteria().andSubjectIdEqualTo(datum.getSubjectId());
        Subject subject=subjectService.showSubjects(subjectExample).get(0);
        datum.setSubjectName(subject.getSubjectName());

        datum.setDatumLastdate(new Date());
        datum.setDatumUser(baseAccount);
        datumService.addDatum(datum);
        return "success";

    }
    @RequestMapping("datumShow.do")
    public tableResponse getDatums(Page page,HttpServletRequest request) {
        //获取cookie信息并进行解析
        //对于userAccount的解码与存储
        String labUserCookie=request.getParameter("labUserCookie");
        String baseAccount=DESUtils.decode(labUserCookie.substring(1,labUserCookie.length()-1));
        baseAccount=baseAccount.substring(0,baseAccount.length()-5);
        UserExample userExample=new UserExample();
        userExample.createCriteria().andUserAccountEqualTo(baseAccount);
        User user=userService.showUser(userExample).get(0);

        System.out.println("page=" + page.toString());
        DatumExample datumExample = new DatumExample();
        DatumExample.Criteria criteria=datumExample.createCriteria();
        if (page.getContext() != null) {
            criteria.andDatumOldnameLike("%" + page.getContext() + "%");
        }
        //判断显示类别，对于管理员用户全显示，对于普通用户要看其所属项目
        if(user.getUserAuthority()==2){
            //判断用户所属项目
            List<Subject> subjects=subjectService.showSubjects(new SubjectExample());
            List<Integer>subjectIds=new ArrayList<>();
            for (Subject subject:subjects){
                boolean bool=false;
                //中文全角分隔
                String[] tempStudent=subject.getSubjectStudent().split("，");
                for (String stu:tempStudent){
                    if (stu.equals(user.getUserName())){
                        bool=true;
                        break;
                    }else{
                        continue;
                    }
                }
                if (bool==true){
                    subjectIds.add(subject.getSubjectId());
                }
            }
            //example加强
            criteria.andSubjectIdIn(subjectIds);
        }


        List<Datum> datums = datumService.getDatums(datumExample);
        int tempMin = Math.min(datums.size(), page.getPage() * page.getLimit() + 1);
        //前台真正显示的数据
        List<Datum> datumPages = new ArrayList<>();
        for (int i = (page.getPage() - 1) * page.getLimit(); i < tempMin; i++) {
            datumPages.add(datums.get(i));
        }
        tableResponse tableResponse = new tableResponse("0", "", datums.size(), datumPages);
        System.out.println(tableResponse.toString());
        return tableResponse;
    }
    //用于下载单文件预习资料
    @RequestMapping(value = "downloadOne.do", method = RequestMethod.GET)
    public String downOne(HttpServletResponse response, Datum datum) {
        System.out.println("进入方法---------------------------");
        System.out.println("newName= " + datum.getDatumNewname());
        try {
           /* if(StringUtil.isNullOrEmpty(fileUrl) || fileUrl.contains("notExistImg.jpg")){
            }*/
            fileController.downloadOne(response, datum.getDatumNewname(), datum.getDatumOldname());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

}
