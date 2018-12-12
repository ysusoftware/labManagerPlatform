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
    public int add(User user); //添加user
    public List<User> showUser(UserExample userExample); //显示user
}
