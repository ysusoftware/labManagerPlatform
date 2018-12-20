package org.software.ysu.service.Interface;

import org.software.ysu.pojo.BlogExample;
import org.software.ysu.pojo.BlogWithBLOBs;

import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/19 15:27
 * @Description 博客管理
 * @Version 1.0
 **/
public interface IBlogService {
    public int addblog(BlogWithBLOBs blog);
    public List<BlogWithBLOBs> getblogs(BlogExample example);
    public int delblog(int id);
    public int updateblog(BlogWithBLOBs blog);
    public int countblog(BlogExample blogductionExample);
    public BlogWithBLOBs getblogById(Integer id);
    public int delblogByExample(BlogExample example);
}
