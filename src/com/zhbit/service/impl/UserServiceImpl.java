package com.zhbit.service.impl;

import com.zhbit.dao.UserDao;
import com.zhbit.domain.User;
import com.zhbit.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhbitcxy.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    /**
     * 错误代码
     * 4000 用户不存在
     * 4001 用户名长度太短
     * 4002 用户名长度太长
     * 4003 用户名长度不正确
     * 4004 用户名格式不正确
     *
     * 4100 密码不正确
     * 4101 密码长度太短
     * 4102 密码长度太长
     * 4103 密码含有非法字符
     */
    @Resource
    private UserDao userDao;
    @Override
    public void loginValidate(User userObj) {
        if (null == userObj) throw new RuntimeException("4000");
        User userOrg = userDao.getUserByUsername(userObj.getUsername().trim());
        if (null == userOrg) throw new RuntimeException("4000");
        if (!userOrg.getPassword().equals(userObj.getPassword().trim())){
            throw  new RuntimeException("4100");
        }
    }

    @Override
    public void registerValidate(User user) {

    }

    @Override
    public void modifpassword(User user) {

    }

    @Override
    public void logout(User user) {

    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public void lockUser(User user) {

    }

    @Override
    public void editUser(User user) {

    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
