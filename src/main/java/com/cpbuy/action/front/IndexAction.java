package com.cpbuy.action.front;

import java.util.List;

public class IndexAction extends FrontBaseAction {

	private List product_list; // 最新商品列表

	public String toIndex() {

		return "toIndex";
	}

	public String toLogin() {
		return "toLogin";
	}
}
