package com.zhbit.home.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.common.action.JsonActionSupport;
import com.zhbit.domain.Product;
import com.zhbit.service.ProductService;
import com.zhbit.utils.Page;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by acer on 2015/6/28.
 */
@Controller("productActionHome")
@Scope("prototype")
public class ProductAction extends JsonActionSupport {
    private Product product;
    private  List<Product> listProduct;
    private  int p;
    private  int num;

    @Resource
    private ProductService productService;

    /**
     * 异步获得分页与数据
     * @return
     */
    public String getPage(){
        //获取分页数据
        listProduct = productService.getPage(p,num);
        //实例化分页
        Page page = new Page(productService.count(), p, num);
        //封装返回数据
        Map<String, Object> data = new HashMap();
        data.put("page",  page.show());
        data.put("list", listProduct);

        ajaxSuccess(data);
        return SUCCESS;
    }
    public String productGetAll(){
        listProduct = productService.getAllProduct();
        System.out.println(listProduct.size());
        return SUCCESS;
    }




    public void setP(int p) {
        this.p = p;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
