package org.software.ysu.service.Interface;

import org.software.ysu.pojo.User;
import org.software.ysu.pojo.UserExample;

import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/12 14:01
 * @Description user service类
 * @Version 1.0
 **/
public interface IUserService {
    public int addUser(User user); //添加user
    public List<User> showUser(UserExample userExample); //显示user
    public User loginUser(String username,String password);//登录
    public int updateUser(User user);//修改user
    public int delUser(int id);
    public int countByExample(UserExample userExample);
    public User getUserById(int id);
}
