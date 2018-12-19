package org.software.ysu.controller;

import org.apache.commons.codec.digest.DigestUtils;
import org.software.ysu.pojo.Introduction;
import org.software.ysu.pojo.User;
import org.software.ysu.service.Interface.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Erisu
 * @date 2018/12/13 20:32
 * @Description 用户管理
 * @Version 1.0
 **/
@RestController
@RequestMapping("user")
public class userController {
    @Resource
    IUserService userService;
    @RequestMapping("initAddUser.do")
    public String randomAddUsers(){
        String text="Erisu";
        for (int i=0;i<10;i++){
            User user=new User();
            user.setUserAccount(String.valueOf(Math.random()*new Date().getTime()));
            //加密后的字符串
            //double key= Math.random();
            String key=text+i;
            String encodeStr=DigestUtils.md5Hex(key);
            user.setUserName("cookiezi");
            user.setUserPassword(encodeStr);
            if(Math.random()>=0.5){
                user.setUserAuthority(1);
            }else{
                user.setUserAuthority(2);
            }
            user.setUserRole(1);
            user.setUserLevel(1);
            user.setUserDes("i robot");
            user.setUserImg("no img");
            user.setUserLastdate(new Date());
            userService.addUser(user);
        }
        return "success";
    }
    @RequestMapping("cacheDel.do")
    public String delCache(){
        //清理introduction表的缓存
        // pass
        return "success";
    }

}
