package com.cpbuy.dao.impl;

import java.util.List;

import com.cpbuy.dao.ICategoryDao;
import com.cpbuy.model.Category;

import jdbc.dao.impl.PagingDaoImpl;

public class CategoryDaoImpl extends PagingDaoImpl implements ICategoryDao {

	/**
	 * 取得分類列表
	 * 
	 * @return
	 */
	public List getCategoryList(Integer id) {

		String sql = "SELECT * FROM CATEGORY WHERE 1=1 ";

		return null;
	}

	/**
	 * 取得分類內容
	 * 
	 * @return
	 */
	public Category getCategoryByid(Integer id) {

		String sql = "SELECT * FROM CATEGORY WHERE ID = ? ";
		Category category = null;
		List list = jdbcTemplate.query(sql, new Object[] { id }, rowMapper);
		if (list != null && list.size() > 0) {
			category = (Category) list.get(0);
		}
		return category;
	}

}
