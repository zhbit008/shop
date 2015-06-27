package com.zhbit.dao.impl;

import com.zhbit.dao.ProductDao;
import com.zhbit.domain.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Integer productId) {

    }

    @Override
    public Product getProduct(Integer productId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Product> getProductList() {
        return null;
    }

    @Override
    public Product getProductByProductname(String productname) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
