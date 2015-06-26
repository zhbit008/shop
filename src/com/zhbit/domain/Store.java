package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Store implements Serializable {
    private Integer id;
    private String storename;
    private Integer product_num;
    private Date  create_time;
    private Integer admin_id;
    private String admin_name;
    private String decript;
    private String address;
    private String tel;
    private String type;

    public Store() {
    }

    public Store(Integer id, String storename, Integer product_num, Date create_time, Integer admin_id, String admin_name, String decript, String address, String tel, String type) {
        this.id = id;
        this.storename = storename;
        this.product_num = product_num;
        this.create_time = create_time;
        this.admin_id = admin_id;
        this.admin_name = admin_name;
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

    public Integer getProduct_num() {
        return product_num;
    }

    public void setProduct_num(Integer product_num) {
        this.product_num = product_num;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
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
