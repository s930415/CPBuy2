package com.cpbuy.action.admin;

import com.cpbuy.modle.Admin;
import com.cpbuy.service.IAdminService;

/**
 * 管理者控制
 * 
 * @author vincent
 *
 */
public class LoginAction extends AdminBaseAction {

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
		
		Admin admin = new Admin();
		admin.setAccount(account);
		admin.setPassword(password);
		adminService.doLogin(admin);
		
		return "doLogin";
	}

}
