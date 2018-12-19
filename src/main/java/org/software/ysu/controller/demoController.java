package org.software.ysu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Erisu
 * @date 2018/12/17 18:27
 * @Description TODO
 * @Version 1.0
 **/
@Controller
public class demoController {
    @RequestMapping("demo")
    public String demo(){
        return "demo";
    }
}
