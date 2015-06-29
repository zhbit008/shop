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
    /**
     * 错误代码
     * 4000 用户不存在
     * 4001 用户名长度太短
     * 4002 用户名长度太长
     * 4003 用户名长度不正确
     * 4004 用户名格式不正确
     *
     * 4100 密码不正确
     * 4101 密码长度太短
     * 4102 密码长度太长
     * 4103 密码含有非法字符
     */
    @Resource
    private ProductDao productDao;
    @Resource
    private ProductCateDao productCateDao;

    @Override
    public List<Product> getAllProduct() {
        return productDao.getProductList();
    }

    @Override
    public Product getProduct(String proname) {
        return productDao.getProductByProductname(proname);
    }

    @Override
    public List<Product> getPage(int pageNo, int pageSize) {
        return productDao.getSomeProduct(pageNo,pageSize);
    }

    @Override
    public long count() {
        return productDao.count();
    }

    @Override
    public List<Product> getProductByType(String type) {
        ProductCate productCate =productCateDao.getProductCateByProductCatename(type);
        return productDao.getProductByCateId(productCate.getId());
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
}
