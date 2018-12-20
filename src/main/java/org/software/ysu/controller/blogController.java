package org.software.ysu.controller;

import com.alibaba.fastjson.JSONObject;
import org.software.ysu.pojo.*;
import org.software.ysu.service.Interface.IBlogService;
import org.software.ysu.service.Interface.IUserService;
import org.software.ysu.utils.DESUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author Erisu
 * @date 2018/12/19 15:34
 * @Description 博客管理
 * @Version 1.0
 **/
@RequestMapping("blog")
@RestController
public class blogController {
    @Resource
    IBlogService blogService;
    @Resource
    IUserService userService;

    /**
     * @param picFile
     * @return
     * @description 这个方法上传的是博客的预览图和大图（整体图）
     */
    @RequestMapping("blogPicUpload.do")
    public layuiResponse uploadPic( @RequestParam(value="file")MultipartFile picFile){
        String fileUrl=fileController.uploadFile("introPic",picFile);
        layuiResponse layuiResponse=new layuiResponse("0","",fileUrl);
        return layuiResponse;
    }
    @RequestMapping("blogBodyPicUpload.do")
    public String uploadIntroBodyPic(@RequestParam(value = "file") MultipartFile picFile) {
        String fileUrl = fileController.uploadFile("introBodyPic", picFile);
        return fileController.kindlResponse(fileUrl);
    }

    @RequestMapping("blogAdd.do")
    public String addBlog(BlogWithBLOBs blog, HttpServletRequest request) {
        //对于userAccount的解码与存储
        String labUserCookie=request.getParameter("labUserCookie");
        String baseAccount=DESUtils.decode(labUserCookie.substring(1,labUserCookie.length()-1));
        baseAccount=baseAccount.substring(0,baseAccount.length()-5);
        UserExample userExample=new UserExample();
        userExample.createCriteria().andUserAccountEqualTo(baseAccount);
        User user=userService.showUser(userExample).get(0);
        //根据类别id查博类别名
        //pass
        //存储其他未存储的参数
        blog.setUserId(user.getUserId());
        blog.setUserName(user.getUserName());
        blog.setBlogCreatetime(new Date());
        blog.setBlogUpdatetime(new Date());
        //调用service方法add
        blogService.addblog(blog);
        return "success";

    }
    @RequestMapping("blogOld.do")
    public BlogWithBLOBs oldBlog(Integer blogId){
        BlogExample example=new BlogExample();
        example.createCriteria().andBlogIdEqualTo(blogId);
        return blogService.getblogs(example).get(0);
    }
    @RequestMapping("blogEdit.do")
    public String editIntro(BlogWithBLOBs blog){
        BlogWithBLOBs oldBlog=blogService.getblogById(blog.getBlogId());
        blog.setUserId(oldBlog.getUserId());
        blog.setUserName(oldBlog.getUserName());
        blog.setBlogCreatetime(oldBlog.getBlogCreatetime());
        blog.setBlogUpdatetime(new Date());
        //判断是否需要文件重传
        if(!oldBlog.getBlogPicbig().equals(blog.getBlogPicbig())){
            //文件已经上除了，所以只需要删除老文件
            fileController.delFile(oldBlog.getBlogPicbig());
        }
        if(!oldBlog.getBlogPicdefault().equals(blog.getBlogPicdefault())){
            //文件已经上除了，所以只需要删除老文件
            fileController.delFile(oldBlog.getBlogPicdefault());
        }
        blogService.updateblog(blog);
        return "success";
    }
}
