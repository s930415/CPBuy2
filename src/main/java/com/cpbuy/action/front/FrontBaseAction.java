package com.cpbuy.action.front;

import java.util.List;

import com.cpbuy.action.BaseAction;

public class FrontBaseAction extends BaseAction {

	private List nav_list; // 標題
	private List pc_list1; // 分類一
	private List pc_list2; // 分類二
	private List pc_list3; // 分類三

	public List getNav_list() {
		return nav_list;
	}

	public void setNav_list(List nav_list) {
		this.nav_list = nav_list;
	}

	public List getPc_list1() {
		return pc_list1;
	}

	public void setPc_list1(List pc_list1) {
		this.pc_list1 = pc_list1;
	}

	public List getPc_list2() {
		return pc_list2;
	}

	public void setPc_list2(List pc_list2) {
		this.pc_list2 = pc_list2;
	}

	public List getPc_list3() {
		return pc_list3;
	}

	public void setPc_list3(List pc_list3) {
		this.pc_list3 = pc_list3;
	}

}
