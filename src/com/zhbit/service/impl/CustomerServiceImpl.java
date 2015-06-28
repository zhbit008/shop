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

/**
 * 错误代码
 * 4000 用户不存在
 * 4100 密码不正确
 */
@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{
    private Customer customer;
    @Resource
    private CustomerDao customerDao;

    /**
     * 验证客户登陆
     * @param customerOrg
     * @return 验证通过后客户对象
     */
    @Override
    public Customer loginValidate(Customer customerOrg) {
        if (null == customerOrg) throw new RuntimeException("4000");

        Customer customerObj =  customerDao.getCustomerByUsername(customerOrg.getUsername().trim());
        if (null == customerObj) throw  new RuntimeException("4000");
        if (!customerObj.getPassword().equals(customerOrg.getPassword().trim())) throw new RuntimeException("4100");
        return customerObj;
    }

    @Override
    public Customer getCustomerByCustomername(String username) {
        return  customerDao.getCustomerByUsername(username);
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
