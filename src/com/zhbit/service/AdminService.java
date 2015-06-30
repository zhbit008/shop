package com.zhbit.service;

import com.zhbit.domain.Admin;

/**
 * Created by acer on 2015/6/29.
 */
public interface AdminService {
    public boolean registerValidate(String username,String password1,String password2);
    public void save(String username, String password);
}
