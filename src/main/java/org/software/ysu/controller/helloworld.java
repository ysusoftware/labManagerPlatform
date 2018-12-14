
package org.software.ysu.controller;

import org.software.ysu.dao.PhotographMapper;
import org.software.ysu.pojo.Photograph;
import org.software.ysu.pojo.User;
import org.software.ysu.pojo.UserExample;
import org.software.ysu.pojo.layuiResponse;
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
    @Resource
    IUserService userService;



    @RequestMapping("testUser.do")
    public List<User> testUser() {
        List<User>users=userService.showUser(new UserExample());
        return users;
    }
    @RequestMapping(value = "testUpload.do",method = RequestMethod.POST)
    public layuiResponse testUpload(@RequestParam(value = "file") MultipartFile logoTest){

        String fileUrl=fileController.uploadFile("logo",logoTest);
        layuiResponse layuiResponse=new layuiResponse("0","",fileUrl);
        return layuiResponse;
    }
//    @RequestMapping(value = "testPhoto.do")
//    public String testInsertPhoto(){
//        Photograph photograph=new Photograph();
//        photograph.setPhotoDes("zzzz");
//        photograph.setPhotoUrl("url");
//        photograph.setSubjectId(1);
//        photographMapper.insert(photograph);
//        return "success";
//    }
}
