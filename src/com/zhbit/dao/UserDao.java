package com.zhbit.dao;

import com.zhbit.domain.User;

import java.util.List;

/**
 * Created by zhbitcxy.
 */
public interface UserDao {
    public void save(User user);
    public void update(User user);
    public void delete(Integer userId);
    public User getUser(Integer userId);
    public List<User> getUsertList();
    public User getUserByUsername(String username);
}
