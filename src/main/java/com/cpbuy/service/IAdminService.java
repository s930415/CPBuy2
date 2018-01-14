package com.cpbuy.service;

import com.cpbuy.modle.Admin;

public interface IAdminService {

	/**
	 * 後台登入
	 * 
	 * @return
	 */
	public Admin doLogin(Admin admin);

}
