package com.cpbuy.service;

import java.util.List;

import com.cpbuy.model.Category;;

public interface ICategoryService {

	/**
	 * 取得分類列表
	 * 
	 * @return
	 */
	public List getCategoryList(Integer id);

}
