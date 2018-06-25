package com.cpbuy.action.admin;

import java.util.List;

import com.cpbuy.action.BaseAction;
import com.cpbuy.model.Admin;

public class AdminBaseAction extends BaseAction {

	Admin admin;
	
	public String checkLogin(){
		return "checkLogin";
	}
	
}
