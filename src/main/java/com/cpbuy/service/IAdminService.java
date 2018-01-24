package com.cpbuy.service;

import com.cpbuy.model.Admin;

public interface IAdminService {

	/**
	 * 後台登入
	 * 
	 * @return
	 */
	public Admin doLogin(Admin admin);

}
