package com.zhbit.dao.impl;

import com.zhbit.dao.ShoppingCartDao;
import com.zhbit.domain.ShoppingCart;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("shoppingCart")
public class ShoppingCartDaoImpl implements ShoppingCartDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(ShoppingCart shoppingCart) {

    }

    @Override
    public void update(ShoppingCart shoppingCart) {

    }

    @Override
    public void delete(Integer shoppingCartId) {

    }

    @Override
    public ShoppingCart getShoppingCart(Integer shoppingCartId) {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<ShoppingCart> getShoppingCartList() {
        return null;
    }

    @Override
    public ShoppingCart getShoppingCartByShoppingCartname(String shoppingCartname) {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
