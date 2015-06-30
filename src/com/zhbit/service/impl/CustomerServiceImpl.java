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

    @Override
    public void save(String username, String password) {
        customer = new Customer(null,username,password,null);
        customerDao.save(customer);
    }

    /**
     * 验证客户登陆
     * @param customerOrg
     * @return 验证通过后客户对象
     */
    @Override
    public Customer loginValidate(Customer customerOrg) {
        if (null == customerOrg) throw new RuntimeException("4000");
        System.out.println("cccc");
        Customer customerObj =  customerDao.getCustomerByUsername(customerOrg.getUsername().trim());
        if (null == customerObj) throw  new RuntimeException("4000");

        if (!customerObj.getPassword().equals(customerOrg.getPassword().trim())) throw new RuntimeException("4100");
        return customerObj;
    }

    /**
     * 错误代码
     * 5000 两次输入密码不相同
     * 5100 用户名已注册
     */
    @Override
    public boolean registerValidate(String username, String password1, String password2) {
        if (!password1.equals(password2)) throw new RuntimeException("5000");

        Customer customerObj =  customerDao.getCustomerByUsername(username.trim());
        if (null != customerObj) throw  new RuntimeException("5100");
        return true;
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
