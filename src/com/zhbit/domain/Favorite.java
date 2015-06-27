package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Favorite implements Serializable {
    private Integer productId;
    private Integer customerId;
    private Date  createtime;

    public Favorite() {
    }

    public Favorite(Integer productId, Integer customerId, Date createtime) {
        this.productId = productId;
        this.customerId = customerId;
        this.createtime = createtime;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
