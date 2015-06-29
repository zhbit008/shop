package com.zhbit.service;

import com.zhbit.domain.Product;
import com.zhbit.domain.ProductCate;

import java.util.List;

/**
 * Created by acer on 2015/6/28.
 */
public interface ProductService {
    public List<Product> getProductList();
    public Product getProduct(String proname);
    public List<Product> getPage(int pageNo,int pageSize, int cip);
    public long count();
}
