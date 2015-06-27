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

    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(Integer orderId) {

    }

    @Override
    public Order getOrder(Integer orderId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Order> getOrderList() {
        return null;
    }

    @Override
    public Order getOrderByOrdername(String ordername) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
