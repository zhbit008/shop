package com.zhbit.home.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.domain.Customer;
import com.zhbit.domain.Product;
import com.zhbit.domain.ProductCate;
import com.zhbit.service.CustomerService;
import com.zhbit.service.ProductCateService;
import com.zhbit.service.ProductService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhbitcxy.
 */
@Controller("indexActionHome")
@Scope("prototype")
public class IndexAction extends ActionSupport {
    Customer customer;
    Integer customerId;
    List<Product> productList;
    @Resource
    private ProductCateService productCateService;
    @Resource
    private CustomerService customerService;

    private List<ProductCate> productCateList;

    /**
     * 主页页面
     * @return
     */
    public String index(){
        //获得组合商品分类列表
        productCateList = productCateService.getComboCateList();
        return SUCCESS;
    }

    /**
     * 登陆页面
     * @return
     */
    public String login(){return SUCCESS;}

    /**
     * 注册页面
      * @return
     */
    public String register(){return SUCCESS;}


//    支付页面
    public String pay(){
        productList = customerService.getCustomerBuyProduct(customerId);
        return SUCCESS;
    }

    //    成功展示页
    public String success(){return SUCCESS;}

    /**
     * getter and setter
     * @return
     */
    public List<ProductCate> getProductCateList() {
        return productCateList;
    }

    public void setProductCateList(List<ProductCate> productCateList) {
        this.productCateList = productCateList;
    }

    public ProductCateService getProductCateService() {
        return productCateService;
    }

    public void setProductCateService(ProductCateService productCateService) {
        this.productCateService = productCateService;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
}
