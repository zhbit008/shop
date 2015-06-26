package com.zhbit.domain;

import java.io.Serializable;
/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Customer_Profile implements Serializable{
    private Integer customer_id;
    private String key;
    private String value;

    public Customer_Profile() {
    }

    public Customer_Profile(Integer customer_id, String value, String key) {
        this.customer_id = customer_id;
        this.value = value;
        this.key = key;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
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
