package com.zhbit.domain;

import java.io.Serializable;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class AdminProfile implements Serializable{

    private Integer adminId;
    private String key;
    private String value;

    public AdminProfile() {
    }

    public AdminProfile(Integer adminId, String key, String value) {
        this.adminId = adminId;
        this.key = key;
        this.value = value;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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
