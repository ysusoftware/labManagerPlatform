package org.software.ysu.service.Interface;

import org.software.ysu.pojo.Category;
import org.software.ysu.pojo.CategoryExample;

import java.util.List;

public interface ICategoryService {
    public List<Category> selectCategory(String categoryName);//条件查询
}
