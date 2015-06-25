package com.zhbit.admin.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by zhbitcxy.
 */
@Controller("adminAdminAction")
@Scope("prototype")
public class AdminAction extends ActionSupport{
    public String index(){
        return SUCCESS;
    }
}
