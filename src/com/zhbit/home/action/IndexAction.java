package com.zhbit.home.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.common.action.JsonActionSupport;
import com.zhbit.domain.Customer;
import com.zhbit.domain.Product;
import com.zhbit.service.ProductService;
import com.zhbit.utils.Page;
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
    private Customer customer;
    private List<Product> listProduct;
    private String pageShow;
//    登录页面
    public String login(){return SUCCESS;}

//    注册页面
    public String register(){return SUCCESS;}
//    主页页面
    public String index(){
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
//    类型展示页
    public String type(){return SUCCESS;}
    //    成功展示页
    public String success(){return SUCCESS;}

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public String getPageShow() {
        return pageShow;
    }

    public void setPageShow(String pageShow) {
        this.pageShow = pageShow;
    }
}
