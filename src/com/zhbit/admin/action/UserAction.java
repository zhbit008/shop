package com.zhbit.admin.action;

import com.zhbit.domain.User;
import com.zhbit.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhbitcxy.
 */
@Controller("userActionAdmin")
@Scope("prototype")
public class UserAction extends JsonActionSupport {
    private User admin;

    @Resource
    private UserService userService;

    public String login(){
        return LOGIN;
    }

    public String loginValidate(){
        try{
            userService.loginValidate(admin);
        }catch (RuntimeException e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
            this.ajaxFail(Integer.parseInt( e.getMessage() ));
            return SUCCESS;
        }
        this.ajaxRedirect("/admin/center_index");
        return SUCCESS;
    }


    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
