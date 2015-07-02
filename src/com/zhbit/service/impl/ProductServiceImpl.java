package com.zhbit.service.impl;

import com.zhbit.dao.ProductCateDao;
import com.zhbit.dao.ProductDao;
import com.zhbit.domain.Product;
import com.zhbit.domain.ProductCate;
import com.zhbit.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by acer on 2015/6/28.
 */
@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;

    @Override
    public List<Product> getProductList() {
        return productDao.getProductList();
    }

    @Override
    public Product getProduct(String proname) {
        return productDao.getProductByProductname(proname);
    }

    @Override
    public List<Product> getPage(int pageNo, int pageSize, int cid) {
        return productDao.getPage(pageNo,pageSize, cid);
    }

    @Override
    public long count(int cid) {
         return productDao.count(cid);
    }

    @Override
    public Product get(Integer id) {
        return productDao.get(id);
    }

    /**
     * getter and setter
     * @return
     */
    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
}
