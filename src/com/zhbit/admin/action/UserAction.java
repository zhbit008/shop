package com.zhbit.admin.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.domain.User;
import com.zhbit.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhbitcxy.
 */
@Controller("adminUserAction")
@Scope("prototype")
public class UserAction extends ActionSupport{
    private User user;
    private List<User> userList;

    @Resource
    private UserService userService;

    public String login(){
        return LOGIN;
    }

    public String loginValidate(){
        try{
            userService.loginValidate(user);
        }catch (RuntimeException e){;
            e.printStackTrace();
            this.addActionError(e.getMessage());
            return LOGIN;
        }
        return SUCCESS;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
