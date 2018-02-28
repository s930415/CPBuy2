package com.cpbuy.service;

import com.cpbuy.model.Admin;

public interface IAdminService {

	/**
	 * 後台登入
	 * 
	 * @return
	 */
	public Admin doLogin(Admin admin);
	
	/**
	 * 後台註冊
	 * 
	 * @param admin
	 */
	public void doRegist(Admin admin);

}
