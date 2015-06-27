package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class ShoppingCart implements Serializable  {
    private Integer productId;
    private Integer customer;
    private Integer num;
    private Date  createtime;

    public ShoppingCart() {
    }

    public ShoppingCart(Integer productId, Integer customer, Integer num, Date createtime) {
        this.productId = productId;
        this.customer = customer;
        this.num = num;
        this.createtime = createtime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
