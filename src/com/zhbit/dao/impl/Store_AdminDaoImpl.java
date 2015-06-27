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

    }

    @Override
    public void update(Store_Admin store_admin) {

    }

    @Override
    public void delete(Integer store_adminId) {

    }

    @Override
    public Store_Admin getStore_Admin(Integer store_adminId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Store_Admin> getStore_AdminList() {
        return null;
    }

    @Override
    public Store_Admin getStore_AdminByStore_Adminname(String store_adminname) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
