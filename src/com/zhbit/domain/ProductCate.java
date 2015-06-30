package com.zhbit.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by laujei1995-lz on 2015/6/26.
 */
public class ProductCate implements Serializable{

    private Integer id;
    private String catename;
    private Integer childnum;
    private Integer pid;
    private List<ProductCate> childCateList;
    public ProductCate() {
    }

    public ProductCate(Integer id, String catename, Integer childnum) {
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<ProductCate> getChildCateList() {
        return childCateList;
    }

    public void setChildCateList(List<ProductCate> childCateList) {
        this.childCateList = childCateList;
    }
}
