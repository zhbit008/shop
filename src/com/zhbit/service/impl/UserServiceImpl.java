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
    @Resource
    private UserDao userDao;
    @Override
    public void loginValidate(User user) {
        User user2 = userDao.getUserByUsername(user.getUsername());
        if (null == user2) throw new RuntimeException("用户不存在");
        if (!user2.getPassword().equals(user.getPassword())){
            throw  new RuntimeException("用户密码不正确");
        }
        if (user2.getIslock()) throw new RuntimeException("用户被锁定");

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
