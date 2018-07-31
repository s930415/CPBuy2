package com.cpbuy.action.admin;

import java.io.File;
import java.util.List;

import com.cpbuy.model.Category;
import com.cpbuy.model.Product;
import com.cpbuy.service.IProductService;
import com.cpbuy.service.impl.ProductServiceImpl;

public class ProductAction extends AdminBaseAction {
	private IProductService productService;
	private Product product;
	private Product s_product;
	private List<Category> c_list;
	private List product_list;
	private Integer p_id;

	private File product_img;
	private String product_imgContentType;
	private String product_imgFileName;

	public File getProduct_img() {
		return product_img;
	}

	public void setProduct_img(File product_img) {
		this.product_img = product_img;
	}

	public String getProduct_imgContentType() {
		return product_imgContentType;
	}

	public void setProduct_imgContentType(String product_imgContentType) {
		this.product_imgContentType = product_imgContentType;
	}

	public String getProduct_imgFileName() {
		return product_imgFileName;
	}

	public void setProduct_imgFileName(String product_imgFileName) {
		this.product_imgFileName = product_imgFileName;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

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

	public String toDetail() {
		product = productService.getProductByid(p_id);
		return "toDetail";
	}
}
