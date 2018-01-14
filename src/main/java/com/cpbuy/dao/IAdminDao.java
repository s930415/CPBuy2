package com.cpbuy.dao;

import com.cpbuy.modle.Admin;

public interface IAdminDao {
	
	/**
	 * 後台登入
	 * 
	 * @return
	 */
	public Admin doLogin(Admin admin);

}
