package com.zhbit.dao;

import com.zhbit.domain.ShoppingItem;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface ShoppingItemDao {
    public void save(ShoppingItem shoppingCart);
    public void update(ShoppingItem shoppingCart);
    public void delete(Integer shoppingCartId);
    public ShoppingItem getShoppingCart(Integer shoppingCartId);
    public List<ShoppingItem> getShoppingCartList();
    public ShoppingItem getShoppingCartByProductId(Integer productId);
}
