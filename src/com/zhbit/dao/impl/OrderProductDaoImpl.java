package com.zhbit.dao.impl;

import com.zhbit.dao.OrderProductDao;
import com.zhbit.domain.OrderProduct;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("orderProductDao")
public class OrderProductDaoImpl implements OrderProductDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(OrderProduct orderproduct) {
        sessionFactory.getCurrentSession().save(orderproduct);
    }

    @Override
    public void update(OrderProduct orderproduct) {
        sessionFactory.getCurrentSession().update(orderproduct);
    }

    @Override
    public void delete(Integer orderId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(OrderProduct.class,orderId));
    }

    @Override
    public OrderProduct getOrderProduct(Integer orderId) {
        return (OrderProduct)sessionFactory.getCurrentSession().get(OrderProduct.class,orderId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<OrderProduct> getOrderProductList() {
        return sessionFactory.getCurrentSession().createQuery("from OrderProduct").list();
    }

    @Override
    public OrderProduct getOrderProductByOrderProductname(String orderId) {
        return (OrderProduct)sessionFactory.getCurrentSession().createQuery("from OrderProduct where orderId=:orderId").setParameter("orderId",orderId).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
