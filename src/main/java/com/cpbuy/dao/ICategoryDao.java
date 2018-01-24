package com.cpbuy.dao;

import java.util.List;

public interface ICategoryDao {
	
	/**
	 * 取得分類列表
	 * 
	 * @return
	 */
	public List getCategoryList(Integer id);

}
