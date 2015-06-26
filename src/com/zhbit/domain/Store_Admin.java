package com.zhbit.domain;

import java.io.Serializable;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Store_Admin implements Serializable{
    private Integer store_id;
    private Integer admin_id;

    public Store_Admin() {
    }

    public Store_Admin(Integer store_id, Integer admin_id) {
        this.store_id = store_id;
        this.admin_id = admin_id;
    }

    public Integer getStore_id() {
        return store_id;
    }

    public void setStore_id(Integer store_id) {
        this.store_id = store_id;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }
}
