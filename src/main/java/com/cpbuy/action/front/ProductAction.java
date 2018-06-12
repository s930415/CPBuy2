package com.cpbuy.action.front;

import java.util.List;

import com.cpbuy.model.Category;
import com.cpbuy.model.Product;
import com.cpbuy.service.IProductService;
import com.cpbuy.service.impl.ProductServiceImpl;

public class ProductAction extends FrontBaseAction {
	private IProductService productService;
	private Product product;
	private Product s_product;
	private List<Category> c_list;
	private List product_list;

	public List getProduct_list() {
		return product_list;
	}

	public void setProduct_list(List product_list) {
		this.product_list = product_list;
	}

	public void setProductService(IProductService productService) {
		this.productService = productService;
	}

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

	public String toList() {
		product_list = productService.getList(product);
		return "toList";
	}

}
