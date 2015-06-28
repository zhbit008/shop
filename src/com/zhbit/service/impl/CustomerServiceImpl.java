package com.zhbit.service.impl;

import com.zhbit.dao.CustomerDao;
import com.zhbit.domain.Customer;
import com.zhbit.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by acer on 2015/6/27.
 */
@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{
    private Customer customer;
    @Resource
    private CustomerDao customerDao;

    @Override
    public Customer getCustomerByCustomername(String username) {
       customer = new Customer("铭尘沐风","123",username,1);
        return customer;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
