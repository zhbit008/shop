package com.zhbit.dao;

import com.zhbit.domain.Store_Admin;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface Store_AdminDao {
    public void save(Store_Admin store_admin);
    public void update(Store_Admin store_admin);
    public void delete(Integer store_adminId);
    public Store_Admin getStore_Admin(Integer store_adminId);
    public List<Store_Admin> getStore_AdminList();
    public Store_Admin getStore_AdminByStoreId(String storeId);
}
