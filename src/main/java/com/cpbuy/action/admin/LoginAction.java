package com.cpbuy.action.admin;

import com.cpbuy.model.Admin;
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
		
		Admin l_admin = new Admin();
		l_admin.setAccount(account);
		l_admin.setPassword(password);
		
		admin = adminService.doLogin(l_admin);
		
		if(admin != null){
			return "s_login";
		}else{
			return "f_login";
		}
	}

}
