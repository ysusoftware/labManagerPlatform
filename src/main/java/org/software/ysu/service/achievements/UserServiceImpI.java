package org.software.ysu.service.achievements;

import org.apache.commons.codec.digest.DigestUtils;
import org.software.ysu.dao.UserMapper;
import org.software.ysu.pojo.User;
import org.software.ysu.pojo.UserExample;
import org.software.ysu.service.Interface.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Erisu
 * @date 2018/12/12 14:03
 * @Description user实现类
 * @Version 1.0
 **/
@Service
public class UserServiceImpI implements IUserService {
    @Resource
    UserMapper userMapper;

    @Override
    public int addUser(User user) {
        userMapper.insertSelective(user);
        return 1;
    }

    @Override
    public List<User> showUser(UserExample userExample) {
        return userMapper.selectByExampleWithBLOBs(userExample);
    }

    @Override
    public User loginUser(String username,String password) {
        UserExample userExample=new UserExample();
        String newPassword=DigestUtils.md5Hex(password);
        userExample.createCriteria().andUserAccountEqualTo(username).andUserPasswordEqualTo(newPassword);
        return userMapper.selectByExample(userExample).get(0);
    }

    @Override
    public int updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return 1;
    }

}
