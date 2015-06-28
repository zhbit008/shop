package com.zhbit.home.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.common.action.JsonActionSupport;
import com.zhbit.domain.Customer;
import com.zhbit.domain.Product;
import com.zhbit.service.ProductService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhbitcxy.
 */
@Controller("indexActionHome")
@Scope("prototype")
public class IndexAction extends ActionSupport {
    @Resource
    private ProductService productService;
    Customer customer;
//    登录页面
    public String login(){return SUCCESS;}

//    注册页面
    public String register(){return SUCCESS;}
//    主页页面
    public String index(){
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        customer = (Customer)session.get("customer");
//        System.out.println(customer.getUsername());
         List<Product> listProduct = productService.getAllProduct();
        System.out.println(listProduct.size());
        return SUCCESS;
    }
//    物品介绍页面
    public String show(){return SUCCESS;}
//    支付页面
    public String pay(){return SUCCESS;}
//    个人信息页面
    public String massage(){return SUCCESS;}
//    店铺页面
    public String shop(){return SUCCESS;}

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
