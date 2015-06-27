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
public class Customer_ProfileDaoImpl implements Customer_ProfileDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Customer_Profile customer_profile) {

    }

    @Override
    public void update(Customer_Profile customer_profile) {

    }

    @Override
    public void delete(Integer customer_profileId) {

    }

    @Override
    public Customer_Profile getCustomer_Profile(Integer customer_profileId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer_Profile> getCustomer_ProfileList() {
        return null;
    }

    @Override
    public Customer_Profile getCustomer_ProfileyByCustomer_Profilename(String customer_profilename) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
