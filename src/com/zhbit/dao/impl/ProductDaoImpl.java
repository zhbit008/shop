package com.zhbit.dao.impl;

import com.zhbit.dao.ProductDao;
import com.zhbit.domain.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.management.Query;
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
        sessionFactory.getCurrentSession().save(product);
    }

    @Override
    public void update(Product product) {
        sessionFactory.getCurrentSession().update(product);
    }

    @Override
    public void delete(Integer id) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Product.class,id));
    }

    @Override
    public Product getProduct(Integer id) {
        return (Product)sessionFactory.getCurrentSession().get(Product.class,id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Product> getProductList() {
        return sessionFactory.getCurrentSession().createQuery("from Product").list();
    }

    @Override
    public Product getProductByProductname(String proname) {
        return (Product)sessionFactory.getCurrentSession().createQuery("from Product where proname=:proname").setParameter("proname",proname).uniqueResult();

    }

    @Override
    public List<Product> getPage(int pageNo,int pageSize, int cid) {
        if (cid == 0){
            return sessionFactory.getCurrentSession().createQuery("from Product").setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).list();
        }else{
            return sessionFactory.getCurrentSession().createQuery("from Product where cateId = :cateId").setParameter("cateId", cid).setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).list();
        }

    }

    @Override
    public long count(int cid) {
        Long cnt;
        if (cid == 0){
            cnt = (Long)sessionFactory.getCurrentSession().createQuery("select count(*) from Product").uniqueResult();
        }else{
            cnt = (Long)sessionFactory.getCurrentSession().createQuery("select count(*) from Product where cateId = :cateId").setParameter("cateId", cid).uniqueResult();
        }
        return cnt;
    }

    @Override
    public List<Product> getProductByCateId(int cateId) {
        return sessionFactory.getCurrentSession().createQuery("from Product where cateId=:cateId").setParameter("cateId",cateId).list();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
