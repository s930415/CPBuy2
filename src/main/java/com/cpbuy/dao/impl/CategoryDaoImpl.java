package com.cpbuy.dao.impl;

import java.util.List;

import com.cpbuy.dao.ICategoryDao;

import jdbc.dao.impl.PagingDaoImpl;

public class CategoryDaoImpl extends PagingDaoImpl implements ICategoryDao {
	
	
	/**
	 * 取得分類列表
	 * 
	 * @return
	 */
	public List getCategoryList(Integer id){
		
		String sql = "SELECT * FROM CATEGORY WHERE 1=1 ";
		
		
		return null;
	}

}
