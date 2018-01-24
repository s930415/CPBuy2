package com.cpbuy.dao;

import com.cpbuy.model.Admin;

public interface IAdminDao {
	
	/**
	 * 後台登入
	 * 
	 * @return
	 */
	public Admin doLogin(Admin admin);

}
