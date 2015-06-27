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
        sessionFactory.getCurrentSession().save(profile);
    }

    @Override
    public void update(Profile profile) {
        sessionFactory.getCurrentSession().update(profile);
    }

    @Override
    public void delete(Integer userId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Profile.class,userId));
    }

    @Override
    public Profile getProfile(Integer userId) {
        return (Profile)sessionFactory.getCurrentSession().get(Profile.class,userId);
    }

    @Override
    public List<Profile> getProfileList() {
        return sessionFactory.getCurrentSession().createQuery("from Profile").list();
    }

    @Override
    public Profile getProfileByKey(String key) {
        return (Profile)sessionFactory.getCurrentSession().createQuery("from Profile where key=:key").setParameter("key",key).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
