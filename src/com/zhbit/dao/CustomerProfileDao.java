package com.zhbit.dao;

import com.zhbit.domain.CustomerProfile;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface CustomerProfileDao {
    public void save(CustomerProfile customerprofile);
    public void update(CustomerProfile customerprofile);
    public void delete(Integer customerprofileId);
    public CustomerProfile getCustomer_Profile(Integer customerprofileId);
    public List<CustomerProfile> getCustomerProfileList();
    public CustomerProfile getCustomerProfileyBykey(String key);
}
