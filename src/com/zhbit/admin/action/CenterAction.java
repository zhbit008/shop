package com.zhbit.admin.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by zhbitcxy.
 */
@Controller("centerActionAdmin")
@Scope("prototype")
public class CenterAction extends ActionSupport {
    public String index(){
        return SUCCESS;
    }
}
