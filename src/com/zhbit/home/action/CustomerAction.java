package com.zhbit.home.action;

import com.opensymphony.xwork2.ActionContext;
import com.zhbit.common.action.JsonActionSupport;
import com.zhbit.domain.Customer;
import com.zhbit.domain.Product;
import com.zhbit.service.CustomerService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhbitcxy.
 */

@Controller("customerActionHome")
@Scope("prototype")
public class CustomerAction extends JsonActionSupport{
    Customer customer;
    String nickName;
    String username;
    String password1;
    String password2;
    Integer customerId;
    List<Product> productList;
    @Resource
    CustomerService customerService;

    /**
     * 客户主页
     * @return
     */
    public String index(){
        customer = customerService.getCustomerById(customerId);
        productList = customerService.getCustomerBuyProduct(customerId);

        return SUCCESS;
    }
    /**
     * 客户登陆验证
     * @return
     */
    public String loginValidate(){
        Customer customerObj = null;
        try{
            customerObj = customerService.loginValidate(customer);
        }catch (RuntimeException e){
//          e.printStackTrace();
            ajaxFail(Integer.parseInt(e.getMessage()));
            return SUCCESS;
        }
        //保存用户信息到session域
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        session.put("customer", customerObj);

        //跳转到首页
        ajaxRedirect("/home/index_index");

        return SUCCESS;
    }


    /**
     * getter and setter
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
