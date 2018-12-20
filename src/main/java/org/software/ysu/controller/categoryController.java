package org.software.ysu.controller;

import org.software.ysu.pojo.Category;
import org.software.ysu.pojo.CategoryExample;
import org.software.ysu.pojo.Page;
import org.software.ysu.pojo.tableResponse;
import org.software.ysu.service.Interface.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("category")
public class categoryController {
    @Autowired
    ICategoryService categoryService;

    @ResponseBody
    @RequestMapping("categoryShow.do")
    public tableResponse ShowPhoto(Page page) {
        CategoryExample example = new CategoryExample();
        if(page.getContext()!=null){
            example.createCriteria().andCategoryNameLike("%"+page.getContext()+"%");
        }
        List<Category> list = categoryService.showCategory(example);
        int tempMin = Math.min(list.size(), page.getPage() * page.getLimit() + 1);
        List<Category> photoPages = new ArrayList<>();
        for (int i = (page.getPage() - 1) * page.getLimit(); i < tempMin; i++) {
            photoPages.add(list.get(i));
        }
        tableResponse tableResponse = new tableResponse("0", "", list.size(), photoPages);
        return tableResponse;
    }
    @RequestMapping("CategoryEdit.do")
    public String editPhoto(Category category){
        System.out.println(category.getCategoryName().toString()+"-----------edit-----------");
        categoryService.modifyCategory(category);
        return "success";
    }
    @ResponseBody
    @RequestMapping("CategoryDel.do")
    public String deletePhoto(int  categoryId){
        int r=categoryService.removeCategory(categoryId);
        if (r>0){
            return "success";
        }
        return "defeat";
    }
    @ResponseBody
    @RequestMapping("addCategory")
    public String addCategory(Category category){
        int r=categoryService.addCategory(category);
        if (r>0){
            return "success";
        }
        return "defeat";
    }
}
