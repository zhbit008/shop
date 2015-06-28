package com.zhbit.dao;

import com.zhbit.domain.OrderProduct;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface OrderProductDao {
    public void save(OrderProduct orderproduct);
    public void update(OrderProduct orderproduct);
    public void delete(Integer orderproductId);
    public OrderProduct getOrderProduct(Integer orderproductId);
    public List<OrderProduct> getOrderProductList();
    public OrderProduct getOrderProductByOrderProductname(String orderId);
}
