package com.zhbit.service.impl;

import com.zhbit.dao.CustomerDao;
import com.zhbit.dao.CustomerProfileDao;
import com.zhbit.dao.ProductDao;
import com.zhbit.dao.ShoppingItemDao;
import com.zhbit.domain.Customer;
import com.zhbit.domain.CustomerProfile;
import com.zhbit.domain.Product;
import com.zhbit.domain.ShoppingItem;
import com.zhbit.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
    private Customer customerObj;
    private CustomerProfile customerProfile;
    List<Product> productsList =new ArrayList<Product>();
    Product product;
    @Resource
    private CustomerDao customerDao;
    @Resource
    private CustomerProfileDao customerProfileDao;
    @Resource
    private ShoppingItemDao shoppingItemDao;
    @Resource
    private ProductDao productDao;
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
    public void alterMassage(String nickName, String username, String password) {
        customerObj = customerDao.getCustomerByUsername(username);
        customerObj.setNickname(nickName);
        customerObj.setPassword(password);
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDao.getCustomer(id);

    }

    @Override
    public List<Product> getCustomerBuyProduct(int customerId) {
        List<ShoppingItem> shopingItemList = shoppingItemDao.getShoppingCartByCustomerId(customerId);

       for (int i=0;i<shopingItemList.size();i++){
           int t = shopingItemList.get(i).getProductId();
            product = productDao.get(t);
           productsList.add(product);

       }
        return  productsList;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }

    public CustomerProfileDao getCustomerProfileDao() {
        return customerProfileDao;
    }

    public void setCustomerProfileDao(CustomerProfileDao customerProfileDao) {
        this.customerProfileDao = customerProfileDao;
    }

    public Customer getCustomerObj() {
        return customerObj;
    }

    public void setCustomerObj(Customer customerObj) {
        this.customerObj = customerObj;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public ShoppingItemDao getShoppingItemDao() {
        return shoppingItemDao;
    }

    public void setShoppingItemDao(ShoppingItemDao shoppingItemDao) {
        this.shoppingItemDao = shoppingItemDao;
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
