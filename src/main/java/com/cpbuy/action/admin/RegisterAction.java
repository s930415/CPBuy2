package com.cpbuy.action.admin;

import com.cpbuy.model.Admin;
import com.cpbuy.service.IAdminService;

public class RegisterAction extends AdminBaseAction {

	IAdminService adminService;

	Admin admin;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}

	public String toRegister() {

		return "toRegister";
	}

	public String doRegister() {

		adminService.doRegist(admin);

		return "doRegister";
	}

}
