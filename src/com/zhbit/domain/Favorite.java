package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Favorite implements Serializable {
    private Integer productId;
    private Integer customerId;
    private Date  createTime;

    public Favorite() {
    }

    public Favorite(Integer productId, Integer customerId, Date createTime) {
        this.productId = productId;
        this.customerId = customerId;
        this.createTime = createTime;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
