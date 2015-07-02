package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class ShoppingItem implements Serializable  {
    private Integer productId;
    private Integer customer;
    private Integer num;
    private Date  createTime;

    public ShoppingItem() {
    }

    public ShoppingItem(Integer productId, Integer customer, Integer num, Date createTime) {
        this.productId = productId;
        this.customer = customer;
        this.num = num;
        this.createTime = createTime;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
