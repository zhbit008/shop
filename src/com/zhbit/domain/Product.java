package com.zhbit.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Product implements Serializable {
    private Integer id;
    private Integer salecount;  
    private String proname;
    private String image;
    private Double originprice;
    private Double saleprice;
    private String decript;
    private Date saledate;
    private Integer cate_id;

    public Product() {
    }

    public Product(Integer id, Integer salecount, String proname, String image, Double originprice, Double saleprice, String decript, Date saledate, Integer cate_id) {
        this.id = id;
        this.salecount = salecount;
        this.proname = proname;
        this.image = image;
        this.originprice = originprice;
        this.saleprice = saleprice;
        this.decript = decript;
        this.saledate = saledate;
        this.cate_id = cate_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalecount() {
        return salecount;
    }

    public void setSalecount(Integer salecount) {
        this.salecount = salecount;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public Double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Double saleprice) {
        this.saleprice = saleprice;
    }

    public Double getOriginprice() {
        return originprice;
    }

    public void setOriginprice(Double originprice) {
        this.originprice = originprice;
    }

    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript;
    }

    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    public Integer getCate_id() {
        return cate_id;
    }

    public void setCate_id(Integer cate_id) {
        this.cate_id = cate_id;
    }
}
