package com.zhbit.dao;

import com.zhbit.domain.Order;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface OrderDao {
    public void save(Order order);
    public void update(Order order);
    public void delete(Integer orderId);
    public Order getOrder(Integer orderId);
    public List<Order> getOrderList();
    public Order getOrderById(String id);
}
