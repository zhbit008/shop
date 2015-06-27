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

    }

    @Override
    public void update(Favorite favorite) {

    }

    @Override
    public void delete(Integer favoriteId) {

    }

    @Override
    public Favorite getFavorite(Integer favoriteId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Favorite> getFavoriteList() {
        return null;
    }

    @Override
    public Favorite getFavoriteByFavoritename(String favoritename) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
