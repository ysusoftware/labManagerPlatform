package org.software.ysu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Erisu
 * @date 2018/12/6 19:26
 * @Description spring的起步
 * @Version 1.0
 **/
@Controller
public class helloworld {
    @RequestMapping("/hello.do")
    public String hello(HttpServletRequest request){
        request.setAttribute("testString", "i am shigetora");
        return "list";
    }
}
