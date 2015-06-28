package com.zhbit.domain;


import java.io.Serializable;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Company implements Serializable {
    private Integer id;
    private String companyname;
    private String tpye;
    private String tel;
    private String address;
    private Integer adminId;

    public Company() {
    }

    public Company(Integer id, String companyname, String tpye, String tel, String address, Integer adminId) {
        this.id = id;
        this.companyname = companyname;
        this.tpye = tpye;
        this.tel = tel;
        this.address = address;
        this.adminId = adminId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getTpye() {
        return tpye;
    }

    public void setTpye(String tpye) {
        this.tpye = tpye;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}
