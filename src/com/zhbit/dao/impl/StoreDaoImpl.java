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

    }

    @Override
    public void update(Store store) {

    }

    @Override
    public void delete(Integer storeId) {

    }

    @Override
    public Store getStore(Integer storeId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Store> getStoreList() {
        return null;
    }

    @Override
    public Store getStoreByStorename(String storename) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
