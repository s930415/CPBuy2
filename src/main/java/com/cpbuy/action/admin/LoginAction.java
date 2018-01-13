package com.cpbuy.action.admin;

import com.cpbuy.service.IAdminService;
/**
 * 管理者控制
 * @author vincent
 *
 */
public class LoginAction extends AdminBaseAction {

	private String adress;
	private String password;

	private IAdminService adminService;

	public String toLogin() {
		
		return "toLogin";
	}

	public String doLogin() {
		
		return "doLogin";
	}

}
