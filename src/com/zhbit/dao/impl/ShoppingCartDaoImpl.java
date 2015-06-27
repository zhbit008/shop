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
        sessionFactory.getCurrentSession().save(shoppingCart);
    }

    @Override
    public void update(ShoppingCart shoppingCart) {
        sessionFactory.getCurrentSession().update(shoppingCart);
    }

    @Override
    public void delete(Integer productId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(ShoppingCart.class,productId));
    }

    @Override
    public ShoppingCart getShoppingCart(Integer productId) {
        return (ShoppingCart)sessionFactory.getCurrentSession().get(ShoppingCart.class,productId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<ShoppingCart> getShoppingCartList() {
        return sessionFactory.getCurrentSession().createQuery("from ShoppingCart").list();
    }

    @Override
    public ShoppingCart getShoppingCartByProductId(String productId) {
        return (ShoppingCart)sessionFactory.getCurrentSession().createQuery("from ShoppingCart where productId=:productId").setParameter("productId",productId).uniqueResult();

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
