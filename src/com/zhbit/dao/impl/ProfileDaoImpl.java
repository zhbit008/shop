package com.zhbit.dao.impl;

import com.zhbit.dao.ProfileDao;
import com.zhbit.domain.Profile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("profileDao")
public class ProfileDaoImpl implements ProfileDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Profile profile) {

    }

    @Override
    public void update(Profile profile) {

    }

    @Override
    public void delete(Integer profileId) {

    }

    @Override
    public Profile getProfile(Integer profileId) {
        return null;
    }

    @Override
    public List<Profile> getProfileList() {
        return null;
    }

    @Override
    public Profile getProfileByProfilename(String profilename) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
