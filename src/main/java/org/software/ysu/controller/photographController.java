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
        int tempMin = Math.min(list.size(), page.getPage() * page.getLimit() + 1);
        List<Photograph> photoPages = new ArrayList<>();
        for (int i = (page.getPage() - 1) * page.getLimit(); i < tempMin; i++) {
            photoPages.add(list.get(i));
        }
        tableResponse tableResponse = new tableResponse("0", "", list.size(), photoPages);
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
        String fileUrl=fileController.uploadFile("achievement",img);
        StringBuilder URL=new StringBuilder();
        URL.append("http://47.105.187.18/pictures/");
        URL.append(fileUrl);
        photo.setPhotoUrl(URL.toString());
        int r=photographService.addPhoto(photo);
        System.out.println(r+"------------"+fileUrl);
        layuiResponse layuiResponse=new layuiResponse("0","",fileUrl);
        return layuiResponse;
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
        System.out.println(photograph.toString()+"-----------edit-----------");
        photographService.modify(photograph);
        return "success";
    }

}


