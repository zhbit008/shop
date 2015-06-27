package com.zhbit.dao;

import com.zhbit.domain.Customer;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface CustomerDao {
    public void save(Customer customer);
    public void update(Customer customer);
    public void delete(Integer customerId);
    public Customer getCustomer(Integer customerId);
    public List<Customer> getCustomerList();
    public Customer getCustomerByUsername(String username);
}
