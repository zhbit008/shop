package com.zhbit.home.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.common.action.JsonActionSupport;
import com.zhbit.service.ShoppingItemService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by zhbitcxy.
 */
@Controller("shoppingActionHome")
@Scope("prototype")
public class ShoppingAction extends JsonActionSupport {
    @Resource
    ShoppingItemService shoppingItemService;
    private int productId;
    /**
     * 购物车页面
     * @return
     */
    public String cart(){
        return SUCCESS;
    }

    /**
     * 新增购物车项
     * @return
     */
    public String addItem(){
        System.out.println(productId);

        ajaxSuccess("已加入购物车");
        return SUCCESS;
    }

    /**
     * getter and setter
     * @param id
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public ShoppingItemService getShoppingItemService() {
        return shoppingItemService;
    }

    public void setShoppingItemService(ShoppingItemService shoppingItemService) {
        this.shoppingItemService = shoppingItemService;
    }
}
