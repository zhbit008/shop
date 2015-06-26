package com.zhbit.domain;

import java.io.Serializable;
/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class Product_Cate implements Serializable{

    private Integer id;
    private String catename;
    private Integer childnum;

    public Product_Cate() {
    }

    public Product_Cate(Integer id, String catename, Integer childnum) {
        this.id = id;
        this.catename = catename;
        this.childnum = childnum;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChildnum() {
        return childnum;
    }

    public void setChildnum(Integer childnum) {
        this.childnum = childnum;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }
}
