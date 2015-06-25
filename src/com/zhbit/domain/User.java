package com.zhbit.domain;

import java.io.Serializable;

/**
 * Created by zhbitcxy.
 */
public class User implements Serializable {
    private Integer id;
    private Integer level;  //用户类别 1表示买家，2表示商家
    private String username;
    private String password;
    private String nickname;
    private Boolean islock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getIslock() {
        return islock;
    }

    public void setIslock(Boolean islock) {
        this.islock = islock;
    }

    public User() {

    }

    public User(Integer id, Integer level, String username, String password, String nickname, Boolean islock) {
        this.id = id;
        this.level = level;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.islock = islock;
    }
}
