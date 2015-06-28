package com.zhbit.dao.impl;

import com.zhbit.dao.StoreDao;
import com.zhbit.domain.Store;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("storeDao")
public class StoreDaoImpl implements StoreDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Store store) {
        sessionFactory.getCurrentSession().save(store);
    }

    @Override
    public void update(Store store) {
        sessionFactory.getCurrentSession().update(store);
    }

    @Override
    public void delete(Integer id) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Store.class,id));
    }

    @Override
    public Store getStore(Integer id) {
        return (Store)sessionFactory.getCurrentSession().get(Store.class,id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Store> getStoreList() {
        return sessionFactory.getCurrentSession().createQuery("from Store").list();
    }

    @Override
    public Store getStoreByStorename(String storename) {
        return (Store)sessionFactory.getCurrentSession().createQuery("from Store where storename=:storename").setParameter("storename",storename).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
