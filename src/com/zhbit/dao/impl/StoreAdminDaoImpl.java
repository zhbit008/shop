package com.zhbit.dao.impl;

import com.zhbit.dao.StoreAdminDao;
import com.zhbit.domain.StoreAdmin;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("storeAdmindao")
public class StoreAdminDaoImpl implements StoreAdminDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(StoreAdmin storeadmin) {
        sessionFactory.getCurrentSession().save(storeadmin);
    }

    @Override
    public void update(StoreAdmin storeadmin) {
        sessionFactory.getCurrentSession().update(storeadmin);
    }

    @Override
    public void delete(Integer storeId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(StoreAdmin.class,storeId));
    }

    @Override
    public StoreAdmin getStoreAdmin(Integer storeId) {
        return (StoreAdmin)sessionFactory.getCurrentSession().get(StoreAdmin.class,storeId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<StoreAdmin> getStoreAdminList() {
        return sessionFactory.getCurrentSession().createQuery("from StoreAdmin").list();
    }

    @Override
    public StoreAdmin getStoreAdminByStoreId(String storeId) {
        return (StoreAdmin)sessionFactory.getCurrentSession().createQuery("from StoreAdmin where storeId=:storeId").setParameter("storeId",storeId).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
