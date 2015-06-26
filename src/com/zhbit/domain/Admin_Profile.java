package com.zhbit.domain;

import java.io.Serializable;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Admin_Profile implements Serializable{

    private Integer admin_id;
    private String key;
    private String value;

    public Admin_Profile() {
    }

    public Admin_Profile(Integer admin_id, String key, String value) {
        this.admin_id = admin_id;
        this.key = key;
        this.value = value;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
