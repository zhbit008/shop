package com.zhbit.home.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.domain.CustomerProfile;
import com.zhbit.service.CustomerService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by acer on 2015/7/2.
 */
@Controller("customerAction")
@Scope("prototype")
public class Customer extends ActionSupport {
    com.zhbit.domain.Customer customer;
    String nickName;
    String username;
    String password1;
    String password2;
    Integer customerId;
    @Resource
    CustomerService customerService;

    public String alter(){
        if(password1.equals(password2)){
            customerService.alterMassage(nickName,username,password1);

        }else{
            System.out.println("ddd");
        }

        return SUCCESS;
    }

    public com.zhbit.domain.Customer getCustomer() {
        return customer;
    }

    public void setCustomer(com.zhbit.domain.Customer customer) {
        this.customer = customer;
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



    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }


}
