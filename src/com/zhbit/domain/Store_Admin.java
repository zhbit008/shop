package com.zhbit.domain;

import java.io.Serializable;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Store_Admin implements Serializable{
    private Integer storeId;
    private Integer adminId;

    public Store_Admin() {
    }

    public Store_Admin(Integer storeId, Integer adminId) {
        this.storeId = storeId;
        this.adminId = adminId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}
