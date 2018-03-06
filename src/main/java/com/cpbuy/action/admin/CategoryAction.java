package com.cpbuy.action.admin;

import java.util.List;

import com.cpbuy.action.BaseAction;
import com.cpbuy.model.Category;
import com.cpbuy.service.ICategoryService;

public class CategoryAction extends AdminBaseAction {

	private ICategoryService categoryService;
	private Integer cg_id;
	private Category category;
	private List page_list;

	private Integer s_cg;

	public List getPage_list() {
		return page_list;
	}

	public void setCategoryService(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public Integer getCg_id() {
		return cg_id;
	}

	public void setCg_id(Integer cg_id) {
		this.cg_id = cg_id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getS_cg() {
		return s_cg;
	}

	public void setS_cg(Integer s_cg) {
		this.s_cg = s_cg;
	}

	public String toList() {
		page_list = categoryService.getCategoryList(0);
		return "toList";
	}
	/**
	 * 詳細頁
	 * @return
	 */
	public String toDetail() {
		if (cg_id != null) {
			category = categoryService.getCategoryByid(cg_id);
		}
		return "toDetail";
	}
	/**
	 * 新增/修改
	 * @return
	 */
	public String doAlert(){
		
		if(category.getId() == null){
			categoryService.addCategory(category);
		}else{
			categoryService.modifyCategory(category);
		}
		return "redirect_toList";
	}

}
