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
        sessionFactory.getCurrentSession().save(customer);
    }

    @Override
    public void update(Customer customer) {
        sessionFactory.getCurrentSession().update(customer);
    }

    @Override
    public void delete(Integer customerId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Customer.class,customerId));
    }

    @Override
    public Customer getCustomer(Integer customerId) {
        return (Customer)sessionFactory.getCurrentSession().get(Customer.class,customerId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer> getCustomerList() {
        return sessionFactory.getCurrentSession().createQuery("from Customer").list();
    }

    @Override
    public Customer getCustomerByUsername(String username) {
        return (Customer)sessionFactory.getCurrentSession().createQuery("from Customer where username=:username").setParameter("username",username).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
