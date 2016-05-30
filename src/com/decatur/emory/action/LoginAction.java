package com.decatur.emory.action;

import org.apache.commons.lang3.StringUtils;

import com.decatur.emory.model.User;
import com.decatur.emory.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven{

	private User user = new User();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void validate(){
		if(StringUtils.isEmpty(user.getUserId())){
			addFieldError("userId","userId error");
		}
		if(StringUtils.isEmpty(user.getPassword())){
			addFieldError("password","password error");
		}
	}
	public String execute(){
		LoginService loginService = new LoginService();	
		if(loginService.verifyLogin(user)){
			return SUCCESS;
		} else {
			return LOGIN;
		}
	}
	
	@Override
	public Object getModel() {
		return user;
	}
}
