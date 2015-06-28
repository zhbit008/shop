package com.zhbit.dao;

import com.zhbit.domain.Order_Product;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface OrderProductDao {
    public void save(Order_Product order_product);
    public void update(Order_Product order_product);
    public void delete(Integer order_productId);
    public Order_Product getOrder_Product(Integer order_productId);
    public List<Order_Product> getOrder_ProductList();
    public Order_Product getOrder_ProductByOrder_Productname(String orderId);
}
