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
        sessionFactory.getCurrentSession().save(admin);
    }

    @Override
    public void update(Admin admin) {
        sessionFactory.getCurrentSession().update(admin);
    }

    @Override
    public void delete(Integer adminId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Admin.class,adminId));
    }

    @Override
    public Admin getAdmin(Integer adminId) {
        return (Admin)sessionFactory.getCurrentSession().get(Admin.class,adminId);

    }
    @SuppressWarnings("unchecked")
    @Override
    public List<Admin> getAdminList() {
        return sessionFactory.getCurrentSession().createQuery("from Admin").list();
    }

    @Override
    public Admin getAdminByAdminname(String adminname) {
        return (Admin)sessionFactory.getCurrentSession().createQuery("from Admin where username=:username").setParameter("username",adminname).uniqueResult();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
