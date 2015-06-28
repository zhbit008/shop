package com.zhbit.dao.impl;

import com.zhbit.dao.ProductCateDao;
import com.zhbit.domain.ProductCate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("productCateDao")
public class ProductCateDaoImpl implements ProductCateDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(ProductCate productcate) {
        sessionFactory.getCurrentSession().save(productcate);
    }

    @Override
    public void update(ProductCate productcate) {
        sessionFactory.getCurrentSession().update(productcate);
    }

    @Override
    public void delete(Integer id) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(ProductCate.class,id));
    }

    @Override
    public ProductCate getProductCate(Integer id) {
        return (ProductCate)sessionFactory.getCurrentSession().get(ProductCate.class,id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<ProductCate> getProductCateList() {
        return sessionFactory.getCurrentSession().createQuery("from ProductCate").list();
    }

    @Override
    public ProductCate getProductCateByProductCatename(String catename) {
        return (ProductCate)sessionFactory.getCurrentSession().createQuery("from ProductCate where catename=:catename").setParameter("catename",catename).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
