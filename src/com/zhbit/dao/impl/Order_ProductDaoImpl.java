package com.zhbit.dao.impl;

import com.zhbit.dao.Order_ProductDao;
import com.zhbit.domain.Order_Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("order_ProductDao")
public class Order_ProductDaoImpl implements Order_ProductDao{
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Order_Product order_product) {
        sessionFactory.getCurrentSession().save(order_product);
    }

    @Override
    public void update(Order_Product order_product) {
        sessionFactory.getCurrentSession().update(order_product);
    }

    @Override
    public void delete(Integer orderId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Order_Product.class,orderId));
    }

    @Override
    public Order_Product getOrder_Product(Integer orderId) {
        return (Order_Product)sessionFactory.getCurrentSession().get(Order_Product.class,orderId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Order_Product> getOrder_ProductList() {
        return sessionFactory.getCurrentSession().createQuery("from Order_Product").list();
    }

    @Override
    public Order_Product getOrder_ProductByOrder_Productname(String orderId) {
        return (Order_Product)sessionFactory.getCurrentSession().createQuery("from Order_Product where orderId=:orderId").setParameter("orderId",orderId).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
