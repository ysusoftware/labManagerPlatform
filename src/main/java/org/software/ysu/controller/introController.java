package org.software.ysu.controller;

import org.software.ysu.pojo.IntroductionExample;
import org.software.ysu.service.Interface.IIntroService;
import org.software.ysu.service.Interface.ISubjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    @RequestMapping("hasIntro.do")
    public String hasIntro(int subjectId){
        IntroductionExample introductionExample=new IntroductionExample();
        introductionExample.createCriteria().andSubjectIdEqualTo(subjectId);
        int count= introService.countIntro(introductionExample);
        if(count==1){
            return "success";
        }else{
            return "fail";
        }
    }
}
