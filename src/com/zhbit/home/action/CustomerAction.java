package com.zhbit.home.action;

import com.zhbit.domain.Customer;
import com.zhbit.service.CustomerService;
import com.zhbit.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by acer on 2015/6/27.
 */
@Controller("customerActionHome")
@Scope("prototype")
public class CustomerAction {
    private Customer customer;
    @Resource
    private CustomerService customerService;

    public String CustomerLogin(){
        AdminControl AC = new AdminControl();
        Customer Ad =new Customer();
        Ad=AC.findadmin(username);
        String adminPass = customerService.getCustomerPassWord(username);
        if(password.equals(adminPass) ){
            ActionContext.getContext().getSession().put("loginUser", username);
            return SUCCESS;		//SUCCESS是Action 接口中的一个常亮，值为success字符串
        }
        else{
            return INPUT;		//INPUT是Action 接口中的一个常亮，值为input字符串
        }
        return success;
    }
}
