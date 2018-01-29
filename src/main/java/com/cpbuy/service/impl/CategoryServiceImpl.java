package com.cpbuy.service.impl;

import java.util.List;

import com.cpbuy.dao.ICategoryDao;
import com.cpbuy.model.Category;
import com.cpbuy.service.ICategoryService;;

public class CategoryServiceImpl implements ICategoryService {

	ICategoryDao categoryDao;

	public void setCategoryDao(ICategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	/**
	 * 取得分類列表
	 * 
	 * @return
	 */
	public List getCategoryList(Integer id) {
		return categoryDao.getCategoryList(id);
	}

}
