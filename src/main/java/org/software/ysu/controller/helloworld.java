package org.software.ysu.controller;

import org.software.ysu.pojo.User;
import org.software.ysu.pojo.UserExample;
import org.software.ysu.service.Interface.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/6 19:26
 * @Description spring的起步
 * @Version 1.0
 **/
@Controller
public class helloworld {
    @Resource
    IUserService userService;

    @RequestMapping("/hello.do")
    public String hello(HttpServletRequest request) {
        request.setAttribute("testString", "i am shigetora");
        return "list";
    }

    @ResponseBody
    @RequestMapping("testUser.do")
    public List<User> testUser() {
        List<User>users=userService.showUser(new UserExample());
        return users;
    }
}
