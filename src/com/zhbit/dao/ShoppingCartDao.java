package com.zhbit.dao;

import com.zhbit.domain.ShoppingCart;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface ShoppingCartDao {
    public void save(ShoppingCart shoppingCart);
    public void update(ShoppingCart shoppingCart);
    public void delete(Integer shoppingCartId);
    public ShoppingCart getShoppingCart(Integer shoppingCartId);
    public List<ShoppingCart> getShoppingCartList();
    public ShoppingCart getShoppingCartByShoppingCartname(String shoppingCartname);
}
