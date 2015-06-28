package com.zhbit.dao.impl;

import com.zhbit.dao.Customer_ProfileDao;
import com.zhbit.domain.Customer_Profile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("customer_ProfileDao")
public class CustomerProfileDaoImpl implements Customer_ProfileDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Customer_Profile customer_profile) {
        sessionFactory.getCurrentSession().save(customer_profile);
    }

    @Override
    public void update(Customer_Profile customer_profile) {
        sessionFactory.getCurrentSession().update(customer_profile);
    }

    @Override
    public void delete(Integer customer_profileId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Customer_Profile.class,customer_profileId));
    }

    @Override
    public Customer_Profile getCustomer_Profile(Integer customer_profileId) {
        return (Customer_Profile)sessionFactory.getCurrentSession().get(Customer_Profile.class,customer_profileId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer_Profile> getCustomer_ProfileList() {
        return sessionFactory.getCurrentSession().createQuery("from Customer_Profile").list();
    }

    @Override
    public Customer_Profile getCustomer_ProfileyBykey(String key) {
        return (Customer_Profile)sessionFactory.getCurrentSession().createQuery("from Customer_Profile where key=:key").setParameter("key",key).uniqueResult();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
