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
@Controller("systemActionHome")
@Scope("prototype")
public class SystemAction extends JsonActionSupport{
    String username;
    String password1;
    String password2;
    String cate;
    @Resource
    CustomerService customerService;
    /**
     * 注册验证
     * @return
     */
    public String registerValidate(){
        try{
            if(cate.equals("Smanager")){
                System.out.println("ddd");
            }else{
//                if(customerService.registerValidate(username,password1,password2)){
//                    customerService.save(username,password1);
//                }
            }

        }catch (RuntimeException e){
//          e.printStackTrace();
            ajaxFail(Integer.parseInt(e.getMessage()));
            return SUCCESS;
        }
        ajaxRedirect("/home/index_index");
        return SUCCESS;
    }

    /**
     * 注销登陆
     * @return
     */
    public String exitHandle(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        session.put("customer", null);
//        TODO session注销不完整
        return LOGIN;
    }

    /**
     * getter and setter
     * @return
     */
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
