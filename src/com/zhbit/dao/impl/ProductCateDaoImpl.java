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
public class ProductCateDaoImpl implements Product_CateDao{
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Product_Cate product_cate) {
        sessionFactory.getCurrentSession().save(product_cate);
    }

    @Override
    public void update(Product_Cate product_cate) {
        sessionFactory.getCurrentSession().update(product_cate);
    }

    @Override
    public void delete(Integer id) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Product_Cate.class,id));
    }

    @Override
    public Product_Cate getProduct_Cate(Integer id) {
        return (Product_Cate)sessionFactory.getCurrentSession().get(Product_Cate.class,id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Product_Cate> getProduct_CateList() {
        return sessionFactory.getCurrentSession().createQuery("from Product_Cate").list();
    }

    @Override
    public Product_Cate getProduct_CateByProduct_Catename(String catename) {
        return (Product_Cate)sessionFactory.getCurrentSession().createQuery("from Product_Cate where catename=:catename").setParameter("catename",catename).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
