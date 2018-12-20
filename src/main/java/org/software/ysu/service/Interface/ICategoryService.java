package org.software.ysu.service.Interface;

import org.software.ysu.pojo.Category;
import org.software.ysu.pojo.CategoryExample;

import java.util.List;

public interface ICategoryService {
    public List<Category> selectCategoryByName(String categoryName);//条件查询
    public List<Category> showCategory(CategoryExample example);
    public int addCategory(Category category);
}
