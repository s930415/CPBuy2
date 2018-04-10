package com.cpbuy.action.admin;

import java.util.List;

import com.cpbuy.model.Category;
import com.cpbuy.model.Product;

public class ProductAction extends AdminBaseAction {

	private Product product;
	private Product s_product;
	private List<Category> c_list;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Product getS_product() {
		return s_product;
	}

	public void setS_product(Product s_product) {
		this.s_product = s_product;
	}

	public List<Category> getC_list() {
		return c_list;
	}

	public void setC_list(List<Category> c_list) {
		this.c_list = c_list;
	}

}
