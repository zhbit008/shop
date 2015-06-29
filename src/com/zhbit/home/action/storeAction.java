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
    /**
     * 商铺页面
     * @return
     */
    public String index(){return SUCCESS;}
}
