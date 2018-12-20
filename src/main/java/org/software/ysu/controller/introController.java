package org.software.ysu.controller;

import com.alibaba.fastjson.JSONObject;
import org.software.ysu.pojo.*;
import org.software.ysu.service.Interface.IIntroService;
import org.software.ysu.service.Interface.ISubjectService;
import org.software.ysu.service.Interface.IUserService;
import org.software.ysu.utils.DESUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/17 10:17
 * @Description 简介的控制管理
 * @Version 1.0
 **/
@RestController
@RequestMapping("intro")
public class introController {
    @Resource
    IIntroService introService;
    @Resource
    IUserService userService;

    @RequestMapping("hasIntro.do")
    public String hasIntro(int subjectId) {
        IntroductionExample introductionExample = new IntroductionExample();
        introductionExample.createCriteria().andSubjectIdEqualTo(subjectId);
        int count = introService.countIntro(introductionExample);
        if (count == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * @param picFile
     * @return
     * @description 这个方法上传的是项目文章的预览图和大图（整体图）
     */
    @RequestMapping("introPicUpload.do")
    public layuiResponse uploadPic(@RequestParam(value="file")MultipartFile picFile){
        String fileUrl=fileController.uploadFile("introPic",picFile);
        layuiResponse layuiResponse=new layuiResponse("0","",fileUrl);
        return layuiResponse;
    }
    @RequestMapping("IntroBodyPicUpload.do")
    public String uploadIntroBodyPic(@RequestParam(value = "file") MultipartFile picFile) {
        String fileUrl = fileController.uploadFile("introBodyPic", picFile);
        return fileController.kindlResponse(fileUrl);
    }

    @RequestMapping("introAdd.do")
    public String addIntro(IntroductionWithBLOBs introduction, HttpServletRequest request) {

        //对于userAccount的解码与存储
        String labUserCookie=request.getParameter("labUserCookie");
        String baseAccount=DESUtils.decode(labUserCookie.substring(1,labUserCookie.length()-1));
        baseAccount=baseAccount.substring(0,baseAccount.length()-5);
        UserExample userExample=new UserExample();
        userExample.createCriteria().andUserAccountEqualTo(baseAccount);
        User user=userService.showUser(userExample).get(0);
        //存储其他未存储的参数
        introduction.setUserId(user.getUserId());
        introduction.setUserName(user.getUserName());
        introduction.setIntroCreatetime(new Date());
        introduction.setIntroUpdatetime(new Date());
        //调用service方法add
        introService.addIntro(introduction);
        return "success";

    }
    @RequestMapping("introOld.do")
    public IntroductionWithBLOBs oldIntro(Integer subjectId){
        IntroductionExample introductionExample=new IntroductionExample();
        introductionExample.createCriteria().andSubjectIdEqualTo(subjectId);
        return introService.getIntros(introductionExample).get(0);
    }
    @RequestMapping("introEdit.do")
    public String editIntro(IntroductionWithBLOBs introduction){
        IntroductionWithBLOBs oldIntro=introService.getIntroById(introduction.getIntroId());
        introduction.setUserId(oldIntro.getUserId());
        introduction.setUserName(oldIntro.getUserName());
        introduction.setIntroCreatetime(oldIntro.getIntroCreatetime());
        introduction.setIntroUpdatetime(new Date());
        //判断是否需要文件重传
        if(!oldIntro.getIntroPicbig().equals(introduction.getIntroPicbig())){
            //文件已经上除了，所以只需要删除老文件
            fileController.delFile(oldIntro.getIntroPicbig());
        }
        if(!oldIntro.getIntroPicdefault().equals(introduction.getIntroPicdefault())){
            //文件已经上除了，所以只需要删除老文件
            fileController.delFile(oldIntro.getIntroPicdefault());
        }
        introService.updateIntro(introduction);
        return "success";
    }
}
