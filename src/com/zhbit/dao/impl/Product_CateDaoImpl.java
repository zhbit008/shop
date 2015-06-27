package com.zhbit.dao.impl;

import com.zhbit.dao.Product_CateDao;
import com.zhbit.domain.Product_Cate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("product_CateDao")
public class Product_CateDaoImpl implements Product_CateDao{
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Product_Cate product_cate) {

    }

    @Override
    public void update(Product_Cate product_cate) {

    }

    @Override
    public void delete(Integer product_cateId) {

    }

    @Override
    public Product_Cate getProduct_Cate(Integer product_cateId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Product_Cate> getProduct_CateList() {
        return null;
    }

    @Override
    public Product_Cate getProduct_CateByProduct_Catename(String product_catename) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
