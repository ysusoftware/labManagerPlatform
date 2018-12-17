package org.software.ysu.controller;

import org.software.ysu.pojo.Photograph;
import org.software.ysu.pojo.PhotographExample;
import org.software.ysu.pojo.tableResponse;
import org.software.ysu.service.Interface.IPhotographService;
import org.software.ysu.service.achievements.PhotographServiceImpI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController_QZS {
    @Autowired
    IPhotographService photographService;
    @ResponseBody
    @RequestMapping("test_qzs.do")
    public tableResponse QzsTest() {
        PhotographExample example=new PhotographExample();
        List<Photograph> list=photographService.selectAll();
        tableResponse tableResponse=new tableResponse("0","",list.size(),list);
        return tableResponse;
    }
}
