package com.zhbit.dao;

import com.zhbit.domain.ProductCate;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface ProductCateDao {
    public void save(ProductCate productcate);
    public void update(ProductCate productcate);
    public void delete(Integer productcateId);
    public ProductCate getProductCate(Integer productcateId);
    public List<ProductCate> getProductCateList();
    public ProductCate getProductCateByProductCatename(String catename);
}
