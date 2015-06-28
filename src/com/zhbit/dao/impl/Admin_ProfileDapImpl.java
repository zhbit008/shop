package com.zhbit.dao.impl;

import com.zhbit.dao.Admin_ProfileDao;
import com.zhbit.domain.Admin_Profile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("admin_ProfileDao")
public class Admin_ProfileDapImpl implements Admin_ProfileDao{
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Admin_Profile admin_profile) {
        sessionFactory.getCurrentSession().save(admin_profile);
    }

    @Override
    public void update(Admin_Profile admin_profile) {
        sessionFactory.getCurrentSession().update(admin_profile);
    }

    @Override
    public void delete(Integer admin_profileId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Admin_Profile.class,admin_profileId));
    }

    @Override
    public Admin_Profile getAdmin_Profile(Integer admin_profileId) {
        return (Admin_Profile)sessionFactory.getCurrentSession().get(Admin_Profile.class,admin_profileId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Admin_Profile> getAdmin_ProfileList() {
        return sessionFactory.getCurrentSession().createQuery("from Admin_Profile").list();
    }

    @Override
    public Admin_Profile getAdmin_ProfileBykey(String key) {
        return (Admin_Profile)sessionFactory.getCurrentSession().createQuery("from Admin_Profile where key=:key").setParameter("key",key).uniqueResult();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
