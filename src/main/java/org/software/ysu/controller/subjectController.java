package org.software.ysu.controller;



import org.software.ysu.pojo.*;
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

    @RequestMapping("subjectsShow.do")
    public tableResponse getSubjects(Page page) {
        System.out.println("page="+page.toString());
        SubjectExample subjectExample = new SubjectExample();
        if (page.getContext() != null){
            subjectExample.createCriteria().andSubjectNameLike("%" + page.getContext() + "%");
        }
        List<Subject>subjects=subjectService.showSubjects(subjectExample);
        int tempMin=Math.min(subjects.size(),page.getPage() * page.getLimit()+1);
        //前台真正显示的数据
        List<Subject>subjectPages=new ArrayList<>();
        for(int i=(page.getPage() - 1) * page.getLimit();i<tempMin;i++){
            subjectPages.add(subjects.get(i));
        }
        tableResponse tableResponse=new tableResponse("0","",subjects.size(),subjectPages);
        System.out.println(tableResponse.toString());
        return tableResponse;
    }
    @RequestMapping("subjectsEdit.do")
    public String editSubjects(Subject subject){
        System.out.println(subject.toString());
        subjectService.updateSubject(subject);
        return "success";
    }
    @RequestMapping("subjectsAll.do")
    public List<Subject>getallSubjects(){
        List<Subject>subjects=subjectService.showSubjects(new SubjectExample());
        return subjects;
    }
}
