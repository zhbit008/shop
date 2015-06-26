package com.zhbit.domain;

import java.io.Serializable;
/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Customer implements Serializable{
    private Integer id;
    private String username;
    private String password;
    private String nickname;


    public Customer() {
    }

    public Customer(String nickname, String password, String username, Integer id) {
        this.nickname = nickname;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
