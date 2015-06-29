package com.zhbit.dao;

import com.zhbit.domain.Product;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface ProductDao {
    public void save(Product product);
    public void update(Product product);
    public void delete(Integer productId);
    public Product getProduct(Integer productId);
    public List<Product> getProductList();
    public Product getProductByProductname(String proname);
    public List<Product> getSomeProduct(int pageNo,int pageSize);
    public long count();
    public List<Product> getProductByCateId(int cateId);
}
