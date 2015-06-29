package com.zhbit.home.action;

import com.opensymphony.xwork2.ActionContext;
import com.zhbit.common.action.JsonActionSupport;
import com.zhbit.domain.Customer;
import com.zhbit.service.CustomerService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by zhbitcxy.
 */

@Controller("customerActionHome")
@Scope("prototype")
public class CustomerAction extends JsonActionSupport {
    Customer customer;

    @Resource
    CustomerService customerService;

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
//        session.put("nickname", "ok");

        //跳转到首页
        ajaxRedirect("/home/index_index");

        return SUCCESS;
    }

    public String exitValidate(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        session.put("customer", null);
        ajaxRedirect("/home/index_index");
        return SUCCESS;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
