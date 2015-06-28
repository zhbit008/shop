package com.zhbit.domain;

/**
 * Created by acer on 2015/6/28.
 */
public class OrderProduct {
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
