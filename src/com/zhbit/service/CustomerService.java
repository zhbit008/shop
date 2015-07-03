package com.zhbit.service;

import com.zhbit.domain.Customer;
import com.zhbit.domain.Product;

import java.util.List;

/**
 * Created by acer on 2015/6/27.
 */
public interface CustomerService {
    public Customer getCustomerByCustomername(String username);
    public Customer loginValidate(Customer customer);
    public boolean registerValidate(String username, String password1 ,String password2);
    public void save(String username,String password);
    public void alterMassage(String nickName,String username,String password);
    public Customer getCustomerById(int id);
    public List<Product> getCustomerBuyProduct(int customerId);
}
