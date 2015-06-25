package com.zhbit.domain;

import java.io.Serializable;

/**
 * Created by zhbitcxy.
 */
public class Profile implements Serializable {
    private Integer userId; //用户ID
    private String key;
    private String value;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Profile(Integer userId, String key, String value) {

        this.userId = userId;
        this.key = key;
        this.value = value;
    }

    public Profile() {

    }
}
