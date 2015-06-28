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

    }

    @Override
    public void update(Admin_Profile admin_profile) {

    }

    @Override
    public void delete(Integer admin_profileId) {

    }

    @Override
    public Admin_Profile getAdminProfile(Integer admin_profileId) {
        return null;
    }

    @Override
    public List<Admin_Profile> getAdminProfileList() {
        return null;
    }

    @Override
    public Admin_Profile getAdminProfileBykey(String key) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
