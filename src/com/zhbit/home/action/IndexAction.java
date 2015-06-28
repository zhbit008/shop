package com.zhbit.home.action;


import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.common.action.JsonActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by zhbitcxy.
 */
@Controller("indexActionHome")
@Scope("prototype")
public class IndexAction extends JsonActionSupport {
//    登录页面
    public String login(){return SUCCESS;}
//    注册页面
    public String register(){return SUCCESS;}
//    主页页面
    public String index(){return SUCCESS;}
//    物品介绍页面
    public String show(){return SUCCESS;}
//    支付页面
    public String pay(){return SUCCESS;}
//    个人信息页面
    public String massage(){return SUCCESS;}
//    店铺页面
    public String shop(){return SUCCESS;}
}
