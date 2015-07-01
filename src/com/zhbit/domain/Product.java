package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Product implements Serializable {
    private Integer id;
    private Integer saleNum;
    private String name;
    private String image;
    private Double originPrice;
    private Double salePrice;
    private String describe;
    private Date dateline;
    private Integer cateId;
    private Integer storeId;
    private String title;
    private String love;

    public Product() {
    }

    public Product(Integer id, Integer saleNum, String name, String image, Double originPrice, Double salePrice, String describe, Date dateline, Integer cateId, Integer storeId, String title, String love) {
        this.id = id;
        this.saleNum = saleNum;
        this.name = name;
        this.image = image;
        this.originPrice = originPrice;
        this.salePrice = salePrice;
        this.describe = describe;
        this.dateline = dateline;
        this.cateId = cateId;
        this.storeId = storeId;
        this.title = title;
        this.love = love;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(Double originPrice) {
        this.originPrice = originPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getDateline() {
        return dateline;
    }

    public void setDateline(Date dateline) {
        this.dateline = dateline;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }
}
