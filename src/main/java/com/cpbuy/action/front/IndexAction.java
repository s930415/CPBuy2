package com.cpbuy.action.front;

import java.util.List;

import com.cpbuy.model.Category;
import com.cpbuy.service.ICategoryService;

public class IndexAction extends FrontBaseAction {

	private List product_list; // 最新商品列表
	private List cg_list;

	private ICategoryService categoryService;

	public void setCategoryService(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public List getProduct_list() {
		return product_list;
	}

	public List getCg_list() {
		return cg_list;
	}

	public String toIndex() {

		product_list = null;
		cg_list = categoryService.getCategoryList(0);

		return "toIndex";
	}

	public String toLogin() {
		return "toLogin";
	}
}
