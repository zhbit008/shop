package com.zhbit.dao.impl;

import com.zhbit.dao.CustomerDao;
import com.zhbit.domain.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(Integer customerId) {

    }

    @Override
    public Customer getCustomer(Integer customerId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer> getCustomerList() {
        return null;
    }

    @Override
    public Customer getCustomerByCustomername(String customername) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
