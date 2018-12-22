package org.software.ysu.controller;

import org.software.ysu.pojo.Material;
import org.software.ysu.service.Interface.IMaterialService;
import org.springframework.http.HttpRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class materialController {
    @Resource
    IMaterialService materialService;

    @RequestMapping(value="/getMaterials.do",method = RequestMethod.GET)
    public List<Material> getMaterials(){
        List<Material> lists=materialService.getMaterials();
        return lists;
    }
    @RequestMapping(value="/getMaterial2s.do",method = RequestMethod.GET)
    public List<Material> getMaterial2s(Material material){
        System.out.println(material);
        List<Material> lists=materialService.getMaterial2s(material);
        return lists;
    }
    @ResponseBody
    @RequestMapping(value="/addMaterial.do",method = RequestMethod.POST)
    public int addMaterial(HttpServletRequest request,Material material){
        return materialService.addMaterial(material);
    }
    @ResponseBody
    @RequestMapping(value="/getMaterial.do",method = RequestMethod.GET)
    public Material getMaterial(HttpServletRequest request,Material material,Integer id){
        return materialService.getMaterial(id);
    }
    @ResponseBody
    @RequestMapping(value="/editMaterial.do",method = RequestMethod.POST)
    public int editMaterial(HttpServletRequest request,Material material){
        return materialService.editMaterial(material);
    }
}
