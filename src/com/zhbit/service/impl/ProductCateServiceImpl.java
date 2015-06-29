package com.zhbit.service.impl;

import com.zhbit.dao.ProductCateDao;
import com.zhbit.domain.ProductCate;
import com.zhbit.service.ProductCateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhbitcxy.
 */
@Service
@Transactional
public class ProductCateServiceImpl implements ProductCateService {
    @Resource
    ProductCateDao productCateDao;
    @Override
    public List<ProductCate> getComboCateList() {
        List<ProductCate> productCateList = productCateDao.getProductCateList();
        productCateList = comboCate(productCateList, 0);
        return productCateList;
    }

    /**
     * 组装分类
     * @param productCateList   分类列表
     * @param pid   父ID
     * @return
     */
    private List<ProductCate> comboCate(List<ProductCate> productCateList, int pid){
        List<ProductCate> childCateList = new ArrayList<ProductCate>();
        for (ProductCate productCate : productCateList){
            if (productCate.getPid() == pid){
                productCate.setChildCateList(comboCate(productCateList, productCate.getId()));
                childCateList.add(productCate);
            }
        }
        return childCateList;
    }
}
