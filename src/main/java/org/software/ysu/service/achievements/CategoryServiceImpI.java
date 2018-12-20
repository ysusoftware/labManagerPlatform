package org.software.ysu.service.achievements;

import org.software.ysu.dao.CategoryMapper;
import org.software.ysu.pojo.Category;
import org.software.ysu.pojo.CategoryExample;
import org.software.ysu.service.Interface.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryServiceImpI implements ICategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public List<Category> selectCategoryByName(String categoryName) {
        CategoryExample example=new CategoryExample();
        example.createCriteria().andCategoryNameLike("%"+categoryName+"%");
       return  categoryMapper.selectByExample(example);
    }

    @Override
    public List<Category> showCategory(CategoryExample example) {
        return categoryMapper.selectByExample(example);
    }

    @Override
    public int addCategory(Category category) {
        return categoryMapper.insert(category);
    }

    @Override
    public int modifyCategory(Category category) {
        return categoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public int removeCategory(int categoryId) {
        return categoryMapper.deleteByPrimaryKey(categoryId);
    }
}
