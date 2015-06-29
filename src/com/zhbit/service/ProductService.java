package com.zhbit.service;

import com.zhbit.domain.Product;

import java.util.List;

/**
 * Created by acer on 2015/6/28.
 */
public interface ProductService {
    public List<Product> getAllProduct();
    public Product getProduct(String proname);
    public List<Product> getSomeProduct(int pageNo,int pageSize);
    public List<Product> getProductByType(String tpye);
}
