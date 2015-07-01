package com.zhbit.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Order implements Serializable {
    private Integer id;
    private Integer status;
    private Integer customerId;
    private String sendName;
    private String sendAdress;
    private String sendTel;
    private String payment;
    private String remark;
    private Date  startTime;
    private Date  endTime;
    public Order() {
    }

    public Order(Integer id, Integer status, Integer customerId, String sendName, String sendAdress, String sendTel, String payment, String remark, Date startTime, Date endTime) {
        this.id = id;
        this.status = status;
        this.customerId = customerId;
        this.sendName = sendName;
        this.sendAdress = sendAdress;
        this.sendTel = sendTel;
        this.payment = payment;
        this.remark = remark;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendAdress() {
        return sendAdress;
    }

    public void setSendAdress(String sendAdress) {
        this.sendAdress = sendAdress;
    }

    public String getSendTel() {
        return sendTel;
    }

    public void setSendTel(String sendTel) {
        this.sendTel = sendTel;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
