package com.zhbit.dao;

import com.zhbit.domain.Customer_Profile;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface Customer_ProfileDao {
    public void save(Customer_Profile customer_profile);
    public void update(Customer_Profile customer_profile);
    public void delete(Integer customer_profileId);
    public Customer_Profile getCustomer_Profile(Integer customer_profileId);
    public List<Customer_Profile> getCustomer_ProfileList();
    public Customer_Profile getCustomer_ProfileyBykey(String key);
}
