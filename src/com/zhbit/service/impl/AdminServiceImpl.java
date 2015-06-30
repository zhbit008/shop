package com.zhbit.service.impl;

import com.zhbit.dao.AdminDao;
import com.zhbit.domain.Admin;
import com.zhbit.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by acer on 2015/6/29.
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService{
    Admin admin;
    @Resource
    private AdminDao adminDao;

    /**
     * 错误代码
     * 5300 两次输入密码不相同
     * 5400 用户名已注册
     */
    @Override
    public boolean registerValidate(String username, String password1, String password2) {
        if (!password1.equals(password2)) throw new RuntimeException("5300");

        Admin adminObj =  adminDao.getAdminByAdminname(username);
        if (null != adminObj) throw  new RuntimeException("5400");
        return true;
    }

    @Override
    public void save(String username,String password) {
        admin = new Admin(null,username,password,null,1);
        adminDao.save(admin);
    }

    public AdminDao getAdminDao() {
        return adminDao;
    }

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }
}
