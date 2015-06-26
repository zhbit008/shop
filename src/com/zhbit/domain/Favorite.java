package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Favorite implements Serializable {
    private Integer product_id;
    private Integer customer_id;
    private Date  createtime;

    public Favorite() {
    }

    public Favorite(Integer product_id, Integer customer_id, Date createtime) {
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.createtime = createtime;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
