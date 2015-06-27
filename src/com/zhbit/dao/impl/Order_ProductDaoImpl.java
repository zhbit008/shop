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
@Repository("companyDao")
public class Order_ProductDaoImpl implements Order_ProductDao{
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Order_Product order_product) {

    }

    @Override
    public void update(Order_Product order_product) {

    }

    @Override
    public void delete(Integer order_productId) {

    }

    @Override
    public Order_Product getOrder_Product(Integer order_productId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Order_Product> getOrder_ProductList() {
        return null;
    }

    @Override
    public Order_Product getOrder_ProductByOrder_Productname(String order_productname) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
