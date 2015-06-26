package com.zhbit.domain;

import java.io.Serializable;
/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Role implements Serializable  {
    private Integer id;
    private String rolename;

    public Role() {
    }

    public Role(Integer id, String rolename) {
        this.id = id;
        this.rolename = rolename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
