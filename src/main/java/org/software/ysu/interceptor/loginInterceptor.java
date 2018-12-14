package org.software.ysu.interceptor;

import org.software.ysu.controller.loginController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Erisu
 * @date 2018/12/10 20:09
 * @Description 登录拦截器
 * @Version 1.0
 **/
public class loginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("进入拦截器");
        String url=httpServletRequest.getRequestURI();
        if(url.contains("managerLogin")){
            return true;
        }
        String labUserCookie=httpServletRequest.getParameter("labUserCookie");
        if(!loginController.AdminMap.isEmpty()){
            String authority=loginController.AdminMap.get(labUserCookie);
            //pass
            return true;


        }
        return false;
    }


    /*handler执行之后，ModelAndView返回之前调用这个方法*/
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }
    /*handler执行完成后调用这个方法*/
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
