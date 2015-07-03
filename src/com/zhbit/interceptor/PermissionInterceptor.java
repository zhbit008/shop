package com.zhbit.interceptor;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.springframework.stereotype.Controller;

@Controller("permissionInterceptor")
public class PermissionInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map session = ActionContext.getContext().getSession();
		Object user = session.get("customer");
		System.out.println(user);
		if (user!=null) {
			return invocation.invoke();
		}else{
			session.put("errorMsg", "您还没有登录，请登录！");
			return "login";
		}
	}

}
