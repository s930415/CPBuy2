package com.cpbuy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cpbuy.dao.IAdminDao;
import com.cpbuy.modle.Admin;

import jdbc.dao.impl.PagingDaoImpl;

public class AdminDaoImpl extends PagingDaoImpl implements IAdminDao {
	
	/**
	 * 後台登入
	 * 
	 * @return
	 */
	public Admin doLogin(Admin admin){
		
		List args = new ArrayList<>();
		String sql = "SELECT * FROM ADMIN WHERE ACCOUNT = ? AND PASSWORD = ? ";
		args.add(admin.getAccount());
		args.add(admin.getPassword());
		List list = jdbcTemplate.query(sql,args.toArray(),rowMapper);
		if(list != null && list.size()==0){
			Admin rtn_admin = (Admin)list.get(0);
			return rtn_admin;
		}
		return null;
	}

}
