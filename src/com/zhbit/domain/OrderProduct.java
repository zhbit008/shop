package com.zhbit.domain;

import java.io.Serializable;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class OrderProduct implements Serializable{
    private Integer orderId;
    private Integer productId;
    private Integer num;

    public OrderProduct() {
    }

    public OrderProduct(Integer orderId, Integer productId, Integer num) {
        this.orderId = orderId;
        this.productId = productId;
        this.num = num;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
