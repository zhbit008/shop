package com.zhbit.service;

import com.zhbit.domain.Customer;

/**
 * Created by acer on 2015/6/27.
 */
public interface CustomerService {
    public Customer getCustomerByCustomername(String username);
    public Customer loginValidate(Customer customer);
    public boolean registerValidate(String username, String password1 ,String password2);
    public void save(String username,String password);
    public void savemassage(String nickName,String username,String password,String realname,String rel,String email,String sex);
}
