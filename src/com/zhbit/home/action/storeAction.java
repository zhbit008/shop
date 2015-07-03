package com.zhbit.home.action;

import com.zhbit.common.action.JsonActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by zhbitcxy.
 */
@Controller("storeActionHome")
@Scope("prototype")
public class storeAction extends JsonActionSupport{
    private int storeId;
    /**
     * 商铺页面
     * @return
     */
    public String index(){return SUCCESS;}

    /**
     * 收藏商铺
     * @return
     */
    public String back(){
        System.out.println(storeId);
        ajaxSuccess("已收藏");
        return  SUCCESS;
    }

    /**
     * getter and setter
     * @param storeId
     */
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
}
