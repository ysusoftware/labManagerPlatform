package org.software.ysu.controller;

import com.alibaba.fastjson.JSON;
import org.software.ysu.pojo.User;
import org.software.ysu.service.Interface.IUserService;
import org.software.ysu.utils.DESUtils;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Erisu
 * @date 2018/12/10 20:00
 * @Description 与登录注销等相关的操作存储
 * @Version 1.0
 **/
@RequestMapping("login")
@RestController
public class loginController {
    @Resource
    IUserService userService;
    public static Map<String,String> AdminMap=new ConcurrentHashMap();
    public static Map<String,String> UserMap=new ConcurrentHashMap();
    @RequestMapping("quit.do")
    public String quit(String labUserCookie){
        AdminMap.remove(labUserCookie);
        return "success";
    }
    @RequestMapping("nothing.do")
    public String nothing(String labUserCookie){
        return AdminMap.get(labUserCookie);
    }
    @RequestMapping("login.do")
    public String login(HttpServletRequest request, String username, String password, String kaptcha){

//        String kaptchaExpected = (String) request.getSession()
//                .getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
//        System.out.println(kaptchaExpected);
        String kaptchaExpected="";
        kaptcha="";
        //验证码获取不到，原因可能是因为layui封装的submit提交没有被验证码的servlet处理定位到
        //首先判断验证码是否输入正确
        if(kaptcha.equalsIgnoreCase(kaptchaExpected)){

            if(userService.loginUser(username,password)!=null){
                User user=userService.loginUser(username,password);
                user.setUserLastdate(new Date());
                userService.updateUser(user);
                //对权限通过encode加密
                String authority=userEncode(user);
                if(user.getUserAuthority()==1){
                    AdminMap.put(user.getUserAuthority()+String.valueOf(authority),user.getUserAccount());
                    return AdminMap.get(user.getUserAccount());
                }else if(user.getUserAuthority()==0){
                    UserMap.put(user.getUserAuthority()+String.valueOf(authority),user.getUserAccount());
                    return UserMap.get(user.getUserAccount());
                }else{
                    return "fail";
                }

            }else{
                //登录失败
                return "fail";
            }
        }
        else{
            return "wrong";
        }


    }
    public String userEncode(User user){
        String temp=user.getUserAuthority()+"Erisu";
        return DESUtils.encode(temp);
    }



}
