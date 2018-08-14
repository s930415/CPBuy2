package com.cpbuy.action.admin;

import java.util.List;
import java.util.Map;

import com.cpbuy.action.BaseAction;
import com.cpbuy.model.Admin;
import com.opensymphony.xwork2.ActionContext;

public class AdminBaseAction extends BaseAction {

	Admin admin;
	
	public String checkLogin(){
		return "checkLogin";
	}
	
	public void validate(){
		super.validate();
		Map session = ActionContext.getContext().getSession();
		System.out.println(session.get("Admin"));
		if(session.get("Admin") == null){
			addFieldError("", "");
		}
	}
	
}
