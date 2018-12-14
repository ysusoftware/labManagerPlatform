package org.software.ysu.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
    public static Map<String,String> loginMap=new ConcurrentHashMap();
    @RequestMapping("quit.do")
    public String quit(String uid){
        loginMap.remove(uid);
        return "success";
    }
    @RequestMapping("nothing.do")
    public String nothing(String uid){
        return loginMap.get(uid);
    }



}
