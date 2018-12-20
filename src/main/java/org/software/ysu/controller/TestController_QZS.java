package org.software.ysu.controller;

import org.software.ysu.pojo.*;
import org.software.ysu.service.Interface.IPhotographService;
import org.software.ysu.service.achievements.PhotographServiceImpI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("photograph")
public class TestController_QZS {
    @Autowired
    IPhotographService photographService;
    @ResponseBody
    @RequestMapping("test_qzs.do")
    public tableResponse QzsTest(Page page) {
        PhotographExample example=new PhotographExample();
        List<Photograph> list=photographService.selectAll(example);
        int tempMin=Math.min(list.size(),page.getPage() * page.getLimit()+1);
        List<Photograph> photoPages=new ArrayList<>();
        for(int i=(page.getPage() - 1) * page.getLimit();i<tempMin;i++){
            photoPages.add(list.get(i));
        }
        tableResponse tableResponse=new tableResponse("0","",list.size(),photoPages);
        return tableResponse;
    }
}
