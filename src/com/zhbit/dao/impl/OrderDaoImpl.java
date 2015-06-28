package com.zhbit.dao.impl;

import com.zhbit.dao.OrderDao;
import com.zhbit.domain.Order;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Override
    public void update(Order order) {
        sessionFactory.getCurrentSession().update(order);
    }

    @Override
    public void delete(Integer id) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Order.class,id));
    }

    @Override
    public Order getOrder(Integer id) {
        return (Order)sessionFactory.getCurrentSession().get(Order.class,id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Order> getOrderList() {
        return sessionFactory.getCurrentSession().createQuery("from Order").list();
    }

    @Override
    public Order getOrderById(String id) {
        return (Order)sessionFactory.getCurrentSession().createQuery("from Order where id=:id").setParameter("id",id).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
