package com.zhbit.dao;

import com.zhbit.domain.StoreAdmin;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface StoreAdminDao {
    public void save(StoreAdmin storeadmin);
    public void update(StoreAdmin storeadmin);
    public void delete(Integer storeadminId);
    public StoreAdmin getStoreAdmin(Integer storeadminId);
    public List<StoreAdmin> getStoreAdminList();
    public StoreAdmin getStoreAdminByStoreId(String storeId);
}
