package com.cpbuy.action.admin;

import java.util.Map;

import com.cpbuy.action.BaseAction;
import com.cpbuy.model.Admin;
import com.cpbuy.service.IAdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

/**
 * 管理者控制
 * 
 * @author vincent
 *
 */
public class LoginAction extends BaseAction {

	private String account;
	private String password;

	private IAdminService adminService;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}

	public String toLogin() {

		return "toLogin";
	}

	public String doLogin() {

		Admin l_admin = new Admin();
		l_admin.setAccount(account);
		l_admin.setPassword(password);

		Admin admin = adminService.doLogin(l_admin);

		if (admin != null) {
			Map session = ActionContext.getContext().getSession();  
			session.put("Admin", admin);
			
			return "s_login";
		} else {
			
			return "f_login";
		}
	}


}
