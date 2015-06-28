package com.zhbit.domain;

import java.io.Serializable;
/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class CustomerProfile implements Serializable{
    private Integer customerId;
    private String key;
    private String value;

    public CustomerProfile() {
    }

    public CustomerProfile(Integer customerId, String key, String value) {
        this.customerId = customerId;
        this.key = key;
        this.value = value;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
