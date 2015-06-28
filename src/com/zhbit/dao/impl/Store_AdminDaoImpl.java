package com.zhbit.dao.impl;

import com.zhbit.dao.Store_AdminDao;
import com.zhbit.domain.Store_Admin;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("store_Admindao")
public class Store_AdminDaoImpl implements Store_AdminDao{
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Store_Admin store_admin) {
        sessionFactory.getCurrentSession().save(store_admin);
    }

    @Override
    public void update(Store_Admin store_admin) {
        sessionFactory.getCurrentSession().update(store_admin);
    }

    @Override
    public void delete(Integer storeId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Store_Admin.class,storeId));
    }

    @Override
    public Store_Admin getStore_Admin(Integer storeId) {
        return (Store_Admin)sessionFactory.getCurrentSession().get(Store_Admin.class,storeId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Store_Admin> getStore_AdminList() {
        return sessionFactory.getCurrentSession().createQuery("from Store_Admin").list();
    }

    @Override
    public Store_Admin getStore_AdminByStoreId(String storeId) {
        return (Store_Admin)sessionFactory.getCurrentSession().createQuery("from Store_Admin where storeId=:storeId").setParameter("storeId",storeId).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
