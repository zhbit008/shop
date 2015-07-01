package com.zhbit.dao.impl;

import com.zhbit.dao.AdminProfileDao;
import com.zhbit.domain.AdminProfile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("adminProfileDao")
public class AdminProfileDapImpl implements AdminProfileDao{
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(AdminProfile adminprofile) {
        sessionFactory.getCurrentSession().save(adminprofile);
    }

    @Override
    public void update(AdminProfile adminprofile) {
        sessionFactory.getCurrentSession().update(adminprofile);
    }

    @Override
    public void delete(Integer adminprofileId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(AdminProfile.class,adminprofileId));
    }

    @Override
    public AdminProfile getAdminProfile(Integer adminprofileId) {
        return (AdminProfile)sessionFactory.getCurrentSession().get(AdminProfile.class,adminprofileId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<AdminProfile> getAdminProfileList() {
        return sessionFactory.getCurrentSession().createQuery("from AdminProfile").list();
    }

    @Override
    public AdminProfile getAdminProfileBykey(String key) {
        return (AdminProfile)sessionFactory.getCurrentSession().createQuery("from AdminProfile where key=:key").setParameter("key",key).uniqueResult();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
