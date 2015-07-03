package com.zhbit.dao.impl;

import com.zhbit.dao.ShoppingItemDao;
import com.zhbit.domain.ShoppingItem;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
@Repository("shoppingItemDao")
public class ShoppingItemDaoImpl implements ShoppingItemDao {
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void save(ShoppingItem ShoppingItem) {
        sessionFactory.getCurrentSession().save(ShoppingItem);
    }

    @Override
    public void update(ShoppingItem ShoppingItem) {
        sessionFactory.getCurrentSession().update(ShoppingItem);
    }

    @Override
    public void delete(Integer productId) {
        sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(ShoppingItem.class,productId));
    }

    @Override
    public ShoppingItem getShoppingCart(Integer productId) {
        return (ShoppingItem)sessionFactory.getCurrentSession().get(ShoppingItem.class,productId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<ShoppingItem> getShoppingCartList() {
        return sessionFactory.getCurrentSession().createQuery("from ShoppingItem").list();
    }

    @Override
    public List<ShoppingItem> getShoppingCartByProductId(String productId) {
        return sessionFactory.getCurrentSession().createQuery("from ShoppingItem where productId=:productId").setParameter("productId",productId).list();
    }

    @Override
    public List<ShoppingItem> getShoppingCartByCustomerId(int customerId) {
        return sessionFactory.getCurrentSession().createQuery("from ShoppingItem where customer=:customerId").setParameter("customerId",customerId).list();
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
