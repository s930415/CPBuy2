package com.cpbuy.service.impl;

import com.cpbuy.dao.IAdminDao;
import com.cpbuy.model.Admin;
import com.cpbuy.service.IAdminService;

public class AdminServiceImpl implements IAdminService {
	IAdminDao adminDao;

	public void setAdminDao(IAdminDao adminDao) {
		this.adminDao = adminDao;
	}

	/**
	 * 後台登入
	 * 
	 * @return
	 */
	public Admin doLogin(Admin admin) {

		return adminDao.doLogin(admin);
	}

}
