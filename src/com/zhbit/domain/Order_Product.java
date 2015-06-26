package com.zhbit.domain;

import java.io.Serializable;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Order_Product implements Serializable{
    private Integer order_id;
    private Integer product_id;
    private Integer num;

    public Order_Product() {
    }

    public Order_Product(Integer order_id, Integer num, Integer product_id) {
        this.order_id = order_id;
        this.num = num;
        this.product_id = product_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
