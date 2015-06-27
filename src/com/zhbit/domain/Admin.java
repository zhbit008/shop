package com.zhbit.domain;

import java.io.Serializable;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Admin  implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Integer roleId;

    public Admin() {
    }

    public Admin(Integer id, String username, String password, String nickname, Integer roleId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.roleId = roleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
