package com.cpbuy.action.admin;

import com.cpbuy.action.BaseAction;
import com.cpbuy.service.ICategoryService;

public class CategoryAction extends AdminBaseAction {

	private ICategoryService categoryService;

	public String toList() {
		categoryService.getCategoryList(0);
		return "toList";
	}

}
