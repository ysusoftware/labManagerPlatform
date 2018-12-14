
package org.software.ysu.controller;

import org.software.ysu.dao.BlogMapper;
import org.software.ysu.pojo.*;
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
    @Resource
    BlogMapper blogMapper;


    @RequestMapping("testUser.do")
    public List<User> testUser() {
        List<User>users=userService.showUser(new UserExample());
        BlogExample blogExample=new BlogExample();
        blogExample.createCriteria().andBlogIdEqualTo(1);
        List<BlogWithBLOBs> blogWithBLOBs = blogMapper.selectByExampleWithBLOBs(blogExample);
        blogWithBLOBs.get(0).getBlogDes();
        return users;
    }
    @RequestMapping(value = "testUpload.do",method = RequestMethod.POST)
    public layuiResponse testUpload(@RequestParam(value = "file") MultipartFile logoTest){

        String fileUrl=fileController.uploadFile("logo",logoTest);
        layuiResponse layuiResponse=new layuiResponse("0","",fileUrl);
        return layuiResponse;
    }
}
