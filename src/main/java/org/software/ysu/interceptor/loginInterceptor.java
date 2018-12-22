package org.software.ysu.interceptor;

import jdk.nashorn.internal.ir.ContinueNode;
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
        String url = httpServletRequest.getRequestURI();
        String sendUrl = httpServletRequest.getParameter("sendUrl");
        String labUserCookie = httpServletRequest.getParameter("labUserCookie");
        if (url.contains("login/login")) {
            return true;
        }
//        else if (url.contains("introController")) {
//            if (labUserCookie == null) {
//                httpServletResponse.getWriter().print("{\"info\":\"404\"}");
//                return false;
//            }
//            if (labUserCookie.isEmpty()) {
//                httpServletResponse.getWriter().print("{\"info\":\"404\"}");
//                return false;
//            }
//            //判断是否为intro的文件上传
//            if ((loginController.UserMap != null && loginController.UserMap.containsKey(labUserCookie)) ||
//                    (loginController.AdminMap != null && loginController.AdminMap.containsKey(labUserCookie)))
//            {
//                return true;
//            }else{
//                httpServletResponse.getWriter().print("{\"info\":\"404\"}");
//                return false;
//            }
//        }
            else if (sendUrl.contains("index2") || sendUrl.contains("introductionAdd")) {
            if (labUserCookie == null) {
                httpServletResponse.getWriter().print("{\"info\":\"404\"}");
                return false;
            }
            if (labUserCookie.isEmpty()) {
                httpServletResponse.getWriter().print("{\"info\":\"404\"}");
                return false;
            }
            if (labUserCookie.substring(0, 1).equals("2")) {
                if (!loginController.UserMap.isEmpty()) {
                    //对管理员登录的管理不在admin表中考虑
                    String authority = loginController.UserMap.get(labUserCookie);
                    if (authority != null) {
                        return true;
                    } else {
                        System.out.println("拦截u");
                        httpServletResponse.getWriter().print("{\"info\":\"404\"}");
                        return false;
                    }
                } else {
                    httpServletResponse.getWriter().print("{\"info\":\"404\"}");
                    return false;
                }
            }
        }

        if (!loginController.AdminMap.isEmpty()&&labUserCookie!=null) {
            String authority = loginController.AdminMap.get(labUserCookie);
            if (authority != null) {
                return true;
            } else {
                System.out.println("拦截a");
                httpServletResponse.getWriter().print("{\"info\":\"404\"}");
                return false;
            }

        } else {
            httpServletResponse.getWriter().print("{\"info\":\"404\"}");
            //httpServletResponse.sendRedirect("http://127.0.0.1:8020/exp/teacher/login/teacherlogin.html");
            return false;
        }
    }


    /*handler执行之后，ModelAndView返回之前调用这个方法*/
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object
            o, ModelAndView modelAndView) throws Exception {

    }

    /*handler执行完成后调用这个方法*/
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse
            httpServletResponse, Object o, Exception e) throws Exception {

    }
}
