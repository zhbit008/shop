package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Store implements Serializable {
    private Integer id;
    private String storename;
    private Integer productNum;
    private Date  createTime;
    private Integer adminId;
    private String adminName;
    private String decript;
    private String address;
    private String tel;
    private String type;

    public Store() {
    }

    public Store(Integer id, String storename, Integer productNum, Date createTime, Integer adminId, String adminName, String decript, String address, String tel, String type) {
        this.id = id;
        this.storename = storename;
        this.productNum = productNum;
        this.createTime = createTime;
        this.adminId = adminId;
        this.adminName = adminName;
        this.decript = decript;
        this.address = address;
        this.tel = tel;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
