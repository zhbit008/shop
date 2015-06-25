package com.zhbit.service;

import com.zhbit.domain.User;

import java.util.List;

/**
 * Created by zhbitcxy.
 */
public interface UserService {
    public void loginValidate(User user);
    public void registerValidate(User user);
    public void modifpassword(User user);
    public void logout(User user);
    public List<User> getAllUser();
    public void addUser(User user);
    public void lockUser(User user);
    public void editUser(User user);
}
