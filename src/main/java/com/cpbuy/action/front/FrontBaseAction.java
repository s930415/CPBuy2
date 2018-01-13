package com.cpbuy.action.front;

import java.util.List;

import com.cpbuy.action.BaseAction;

public class FrontBaseAction extends BaseAction {

	private List nav_list; // 標題
	private List c_list1; // 分類一
	private List c_list2; // 分類二
	private List c_list3; // 分類三

	public List getNav_list() {
		return nav_list;
	}

	public void setNav_list(List nav_list) {
		this.nav_list = nav_list;
	}

	public List getC_list1() {
		return c_list1;
	}

	public void setC_list1(List c_list1) {
		this.c_list1 = c_list1;
	}

	public List getC_list2() {
		return c_list2;
	}

	public void setC_list2(List c_list2) {
		this.c_list2 = c_list2;
	}

	public List getC_list3() {
		return c_list3;
	}

	public void setC_list3(List c_list3) {
		this.c_list3 = c_list3;
	}

}
