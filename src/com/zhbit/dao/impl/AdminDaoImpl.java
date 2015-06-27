package com.zhbit.dao.impl;

import com.zhbit.dao.AdminDao;
import com.zhbit.domain.Admin;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Admin admin) {

    }

    @Override
    public void update(Admin admin) {

    }

    @Override
    public void delete(Integer adminId) {

    }

    @Override
    public Admin getAdmin(Integer adminId) {
        return null;
    }

    @Override
    public List<Admin> getAdminList() {
        return null;
    }

    @Override
    public Admin getAdminByAdminname(String adminname) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
