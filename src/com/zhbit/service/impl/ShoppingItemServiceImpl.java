package com.zhbit.service.impl;

import com.zhbit.dao.ShoppingItemDao;
import com.zhbit.domain.ShoppingItem;
import com.zhbit.service.ShoppingItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by zhbitcxy.
 */
@Service("shoppingItemService")
@Transactional
public class ShoppingItemServiceImpl implements ShoppingItemService {
    @Resource
    ShoppingItemDao shoppingItemDao;
    @Override
    public ShoppingItem get(Integer id) {
        return shoppingItemDao.getShoppingCartByProductId(id);
    }
}
