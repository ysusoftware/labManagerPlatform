package org.software.ysu.controller;


import org.software.ysu.pojo.*;
import org.software.ysu.service.Interface.IDatumService;
import org.software.ysu.service.Interface.IIntroService;
import org.software.ysu.service.Interface.IPhotographService;
import org.software.ysu.service.Interface.ISubjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/14 16:17
 * @Description 项目管理的实现
 * @Version 1.0
 **/
@RestController
@RequestMapping("subject")
public class subjectController {
    @Resource
    ISubjectService subjectService;
    @Resource
    IIntroService introService;
    @Resource
    IPhotographService photographService;
    @Resource
    IDatumService datumService;

    @RequestMapping("subjectsShow.do")
    public tableResponse getSubjects(Page page) {
        System.out.println("page=" + page.toString());
        SubjectExample subjectExample = new SubjectExample();
        if (page.getContext() != null) {
            subjectExample.createCriteria().andSubjectNameLike("%" + page.getContext() + "%");
        }
        List<Subject> subjects = subjectService.showSubjects(subjectExample);
        int tempMin = Math.min(subjects.size(), page.getPage() * page.getLimit() + 1);
        //前台真正显示的数据
        List<Subject> subjectPages = new ArrayList<>();
        for (int i = (page.getPage() - 1) * page.getLimit(); i < tempMin; i++) {
            subjectPages.add(subjects.get(i));
        }
        tableResponse tableResponse = new tableResponse("0", "", subjects.size(), subjectPages);
        System.out.println(tableResponse.toString());
        return tableResponse;
    }

    @RequestMapping("subjectsEdit.do")
    public String editSubjects(Subject subject) {
        System.out.println(subject.toString());
        subjectService.updateSubject(subject);
        return "success";
    }

    @RequestMapping("subjectsAll.do")
    public List<Subject> getallSubjects() {
        List<Subject> subjects = subjectService.showSubjects(new SubjectExample());
        return subjects;
    }

    @RequestMapping("subjectAdd.do")
    public String addSubject(Subject subject) {
        //判断是否有重名项目
        SubjectExample subjectExample = new SubjectExample();
        subjectExample.createCriteria().andSubjectNameEqualTo(subject.getSubjectName());
        List<Subject> subjects = subjectService.showSubjects(subjectExample);
        if (!subjects.isEmpty()) {
            return "repeat";
        } else {
            System.out.println("nothing find");
        }
        int i = subjectService.addSubject(subject);
        if (i > 0) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("subjectDel.do")
    public String delSubject(int subjectId) {
        //删除subject表
        int i = subjectService.delSubject(subjectId);
        if (i == 0) {
            return "fail";
        }
        //删除intro表
        IntroductionExample introductionExample = new IntroductionExample();
        introductionExample.createCriteria().andSubjectIdEqualTo(subjectId);
        //删除intro表的对应文件
        IntroductionWithBLOBs introduction = introService.getIntros(introductionExample).get(0);
        int j = introService.delIntroByExample(introductionExample);
        //删除intro的对应文件（部分不可删。）
        if(introduction!=null){
            fileController.delFile(introduction.getIntroDocument());
            fileController.delFile(introduction.getIntroPicdefault());
            fileController.delFile(introduction.getIntroPicbig());
        }
        //删除photo表
        PhotographExample photographExample=new PhotographExample();
        photographExample.createCriteria().andSubjectIdNotEqualTo(subjectId);
        List<Photograph>photographs=photographService.selectAll(photographExample);
        //删除对应的photo文件
        if(!photographs.isEmpty()){
            for(Photograph photo : photographs){
                fileController.delFile(photo.getPhotoUrl());
            }
        }
        //删除photo的对应文件
        int k = photographService.delPhoto(photographExample);
        //删除datum表
        DatumExample datumExample=new DatumExample();
        datumExample.createCriteria().andSubjectIdEqualTo(subjectId);
        List<Datum>datumList=datumService.getDatums(datumExample);
        //删除datum对应的文件
        if(!datumList.isEmpty()){
            for (Datum datum:datumList){
                fileController.delFile(datum.getDatumNewname());
                datumService.delDatum(datum.getDatumId());
            }
        }

        return "success";
    }
}
