package com.zhbit.dao.impl;

import com.zhbit.dao.CustomerProfileDao;
import com.zhbit.domain.CustomerProfile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("customerProfileDao")
public class CustomerProfileDaoImpl implements CustomerProfileDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(CustomerProfile customerprofile) {
        sessionFactory.getCurrentSession().save(customerprofile);
    }

    @Override
    public void update(CustomerProfile customerprofile) {
        sessionFactory.getCurrentSession().update(customerprofile);
    }

    @Override
    public void delete(Integer customerprofileId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(CustomerProfile.class,customerprofileId));
    }

    @Override
    public CustomerProfile getCustomer_Profile(Integer customerprofileId) {
        return (CustomerProfile)sessionFactory.getCurrentSession().get(CustomerProfile.class,customerprofileId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<CustomerProfile> getCustomerProfileList() {
        return sessionFactory.getCurrentSession().createQuery("from CustomerProfile").list();
    }

    @Override
    public CustomerProfile getCustomerProfileyBykey(String key) {
        return (CustomerProfile)sessionFactory.getCurrentSession().createQuery("from CustomerProfile where key=:key").setParameter("key",key).uniqueResult();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
