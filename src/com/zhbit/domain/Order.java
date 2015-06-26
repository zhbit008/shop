package com.zhbit.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Order implements Serializable {
    private Integer id;
    private Integer status;
    private Integer customer_id;
    private String sendname;
    private String sendadress;
    private String sendtel;
    private String paymet;
    private String remark;
    private Date  createtime;

    public Order() {
    }

    public Order(Integer id, Integer status, Integer customer_id, String sendname, String sendadress, String sendtel, String paymet, String remark, Date createtime) {
        this.id = id;
        this.status = status;
        this.customer_id = customer_id;
        this.sendname = sendname;
        this.sendadress = sendadress;
        this.sendtel = sendtel;
        this.paymet = paymet;
        this.remark = remark;
        this.createtime = createtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getSendname() {
        return sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname;
    }

    public String getSendadress() {
        return sendadress;
    }

    public void setSendadress(String sendadress) {
        this.sendadress = sendadress;
    }

    public String getSendtel() {
        return sendtel;
    }

    public void setSendtel(String sendtel) {
        this.sendtel = sendtel;
    }

    public String getPaymet() {
        return paymet;
    }

    public void setPaymet(String paymet) {
        this.paymet = paymet;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
