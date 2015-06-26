package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class ShoppingCart implements Serializable  {
    private Integer product_id;
    private Integer customer;
    private Integer num;
    private Date  createtime;

    public ShoppingCart() {
    }

    public ShoppingCart(Integer product_id, Integer customer, Integer num, Date createtime) {
        this.product_id = product_id;
        this.customer = customer;
        this.num = num;
        this.createtime = createtime;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
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
