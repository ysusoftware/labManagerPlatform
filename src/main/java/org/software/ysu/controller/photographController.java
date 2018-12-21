package org.software.ysu.controller;

import org.software.ysu.pojo.*;
import org.software.ysu.service.Interface.IPhotographService;
import org.software.ysu.service.Interface.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("photograph")
public class photographController {
    @Autowired
    IPhotographService photographService;
    @Autowired
    ISubjectService subjectService;
    @ResponseBody
    @RequestMapping("showPhoto.do")
    public tableResponse ShowPhoto(Page page) {
        PhotographExample example = new PhotographExample();
        if(page.getContext()!=null){
            example.createCriteria().andPhotoDesLike("%"+page.getContext()+"%");
        }
        List<Photograph> list = photographService.selectAll(example);
        List<photographyShow> photoShow=new ArrayList<>();
        for (Photograph photo:list) {
            photographyShow photographyShow=new photographyShow();
            photographyShow.setSubjectName(subjectService.selectByKey(photo.getSubjectId()).getSubjectName());
            photographyShow.setPhotoUrl(photo.getPhotoUrl());
            photographyShow.setPhotoDes(photo.getPhotoDes());
            photographyShow.setPhotoId(photo.getPhotoId());
            photographyShow.setSubjectId(photo.getSubjectId());
            photoShow.add(photographyShow);
        }
        int tempMin = Math.min(photoShow.size(), page.getPage() * page.getLimit() + 1);
        List<photographyShow> photoPages = new ArrayList<>();
        for (int i = (page.getPage() - 1) * page.getLimit(); i < tempMin; i++) {
            photoPages.add(photoShow.get(i));
        }
        tableResponse tableResponse = new tableResponse("0", "", photoShow.size(), photoPages);
        return tableResponse;
    }
    @ResponseBody
    @RequestMapping("delPhoto.do")
    public String delPhoto(String photoId) {
        System.out.println("--------!!!!---------------");
        int r=photographService.remove(Integer.valueOf(photoId));
        if (r>0){
            return "success";
        }
        return "defeat";
    }
    @ResponseBody
    @RequestMapping("PhotoOnload.do")
    public layuiResponse imgTest(@RequestParam(value = "file") MultipartFile img, Photograph photo) {
        if(photo.getSubjectId()==null || photo.getPhotoDes()==null){
            layuiResponse layuiResponse=new layuiResponse("1","","defeat");
            return layuiResponse;
        }else {
            String fileUrl = fileController.uploadFile("achievement", img);
            StringBuilder URL = new StringBuilder();
            URL.append("http://47.105.187.18/pictures/");
            URL.append(fileUrl);
            photo.setPhotoUrl(URL.toString());
            int r = photographService.addPhoto(photo);
            System.out.println(r + "------------" + fileUrl);
            layuiResponse layuiResponse = new layuiResponse("0", "", fileUrl);
            return layuiResponse;
        }
    }
    @ResponseBody
    @RequestMapping("getData.do")//添加成果时获取项目列表
    public List<Subject> getData() {
        SubjectExample example=new SubjectExample();
        List<Subject> subjects=subjectService.showSubjects(example);
        return subjects;
    }
    @RequestMapping("photoEdit.do")
    public String editPhoto(Photograph photograph){
        System.out.println(photograph.getPhotoId()+"-----------edit-----------");
        photographService.modify(photograph);
/*        List<Photograph> list=photographService.selectByDes(photograph.getPhotoDes());
        System.out.println(list.get(0).getPhotoDes());*/
        return "success";
    }

}


