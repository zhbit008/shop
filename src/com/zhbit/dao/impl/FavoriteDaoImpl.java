package com.zhbit.dao.impl;

import com.zhbit.dao.FavoriteDao;
import com.zhbit.domain.Favorite;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("favoriteDao")
public class FavoriteDaoImpl implements FavoriteDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(Favorite favorite) {
        sessionFactory.getCurrentSession().save(favorite);
    }

    @Override
    public void update(Favorite favorite) {
        sessionFactory.getCurrentSession().update(favorite);
    }

    @Override
    public void delete(Integer customerId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Favorite.class,customerId));
    }

    @Override
    public Favorite getFavorite(Integer customerId) {
        return (Favorite)sessionFactory.getCurrentSession().get(Favorite.class,customerId);

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Favorite> getFavoriteList() {
        return sessionFactory.getCurrentSession().createQuery("from Favorite").list();
    }

    @Override
    public Favorite getFavoriteByCustomerId(String customerId) {
        return (Favorite)sessionFactory.getCurrentSession().createQuery("from Favorite where customerId=:customerId").setParameter("customerId",customerId).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
