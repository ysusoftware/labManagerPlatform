package org.software.ysu.service.achievements;

import org.software.ysu.dao.BlogMapper;
import org.software.ysu.pojo.BlogExample;
import org.software.ysu.pojo.BlogWithBLOBs;
import org.software.ysu.service.Interface.IBlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/19 15:30
 * @Description 博客管理
 * @Version 1.0
 **/
@Service
public class BlogServiceImpI implements IBlogService {
    @Resource
    BlogMapper blogMapper;
    @Override
    public int addblog(BlogWithBLOBs blog) {
        return blogMapper.insertSelective(blog);
    }

    @Override
    public List<BlogWithBLOBs> getblogs(BlogExample example) {
        return blogMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public int delblog(int id) {
        return blogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateblog(BlogWithBLOBs blog) {
        return blogMapper.updateByPrimaryKeySelective(blog);
    }

    @Override
    public int countblog(BlogExample Example) {
        return (int)blogMapper.countByExample(Example);
    }

    @Override
    public BlogWithBLOBs getblogById(Integer id) {
        return blogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delblogByExample(BlogExample example) {
        return blogMapper.deleteByExample(example);
    }
}
