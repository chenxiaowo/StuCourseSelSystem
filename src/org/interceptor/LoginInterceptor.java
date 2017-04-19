package org.interceptor;

import org.action.LoginAction;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		 Xsb xs  = (Xsb) ActionContext.getContext().getSession().get("xsxx");  
	        
		 //如果是登录请求则直接放行  
	        Object o = arg0.getAction();  
	        System.out.println(o.getClass());  
	        if(o instanceof LoginAction){  
	            return arg0.invoke();  
	        }  
		 if(null == xs){  
	            return "login";  // 这里返回用户登录页面视图  
	        }  
	        return arg0.invoke();  
	}

}
