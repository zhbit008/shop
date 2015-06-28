package com.zhbit.dao;

import com.zhbit.domain.Store;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface StoreDao {
    public void save(Store store);
    public void update(Store store);
    public void delete(Integer storeId);
    public Store getStore(Integer storeId);
    public List<Store> getStoreList();
    public Store getStoreByStorename(String storename);
}
