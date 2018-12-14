
package org.software.ysu.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.software.ysu.pojo.*;
import org.software.ysu.service.Interface.ICategoryService;
import org.software.ysu.service.Interface.IPhotographService;
import org.software.ysu.service.Interface.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import org.software.ysu.service.Interface.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/6 19:26
 * @Description spring的起步
 * @Version 1.0
 **/
@RestController
public class helloworld {
    @Autowired
    ICategoryService categoryService;
    @Autowired
    IUserService userService;
    @Autowired
    IPhotographService photographService;
    @RequestMapping("/hello.do")
    public String hello(HttpServletRequest request) {
        request.setAttribute("testString", "i am shigetora");
        return "list";
    }


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
    @RequestMapping("PhotoOnload.do")
    public String imgTest(MultipartFile img, Photograph photo) {
        System.out.println(photo.getPhotoDes());
        String fileUrl=fileController.uploadFile("achievement",img);
        photo.setPhotoUrl(fileUrl);
        int r=photographService.addPhoto(photo);
        System.out.println(r+"------------");
        return "success";
    }
    @RequestMapping(value = "testUpload.do",method = RequestMethod.POST)
    public layuiResponse testUpload(@RequestParam(value = "file") MultipartFile logoTest){

        String fileUrl=fileController.uploadFile("logo",logoTest);
        layuiResponse layuiResponse=new layuiResponse("0","",fileUrl);
        return layuiResponse;
    }
}
