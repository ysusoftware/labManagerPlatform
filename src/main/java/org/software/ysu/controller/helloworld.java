package org.software.ysu.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.software.ysu.pojo.Category;
import org.software.ysu.pojo.User;
import org.software.ysu.pojo.UserExample;
import org.software.ysu.service.Interface.ICategoryService;
import org.software.ysu.service.Interface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/6 19:26
 * @Description spring的起步
 * @Version 1.0
 **/
@Controller
public class helloworld {
    @Autowired
    ICategoryService categoryService;
    @Autowired
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
    @ResponseBody
    @RequestMapping("testCategory.do")
    public List<Category> testCategory() {
        String str="据";
        List<Category> list=categoryService.selectCategory(str);
        return list;
    }
    @RequestMapping("img.do")
    public String img() {
        return "ImgTest";
    }
    @ResponseBody
    @RequestMapping("imgOnload.do")
    public String imgTest(MultipartFile img) {
        Client client=new Client();
        System.out.println(img.getOriginalFilename());
        WebResource webResource= client.resource("http://47.105.187.18/pictures/logo/"+img.getOriginalFilename());
        System.out.println("http://47.105.187.18/pictures/logo/"+img.getOriginalFilename());
        try {
            webResource.put(String.class,img.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
