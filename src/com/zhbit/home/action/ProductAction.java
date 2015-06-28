package com.zhbit.home.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.domain.Product;
import com.zhbit.service.ProductService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by acer on 2015/6/28.
 */
@Controller("productActionHome")
@Scope("prototype")
public class ProductAction extends ActionSupport {
    private Product product;
    private  List<Product> listProduct;
    @Resource
    private ProductService productService;

    public String productGetAll(){
        listProduct = productService.getAllProduct();
        System.out.println(listProduct.size());
        return SUCCESS;
    }

    public String productGetAll2(int pageNo,int pageSize){
//        listProduct = productService.getSomeProduct(pageNo,pageSize);
        return SUCCESS;
    }
}
