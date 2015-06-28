package com.zhbit.dao;

import com.zhbit.domain.Product_Cate;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface ProductCateDao {
    public void save(Product_Cate product_cate);
    public void update(Product_Cate product_cate);
    public void delete(Integer product_cateId);
    public Product_Cate getProduct_Cate(Integer product_cateId);
    public List<Product_Cate> getProduct_CateList();
    public Product_Cate getProduct_CateByProduct_Catename(String catename);
}
