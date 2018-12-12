package org.software.ysu.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Erisu
 * @date 2018/12/10 20:00
 * @Description 与登录注销等相关的操作存储
 * @Version 1.0
 **/
public class loginController {
    public static Map<String,String> loginMap=new ConcurrentHashMap();

}
