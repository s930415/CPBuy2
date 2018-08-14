package com.cpbuy.action.admin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.cpbuy.model.Category;
import com.cpbuy.model.Product;
import com.cpbuy.service.IProductCategoryService;
import com.cpbuy.service.IProductService;

public class ProductAction extends AdminBaseAction {
	private IProductService productService;
	private IProductCategoryService productCategoryService;

	private Product product; 
	private Product s_product;
	private List<Category> c_list;
	private List product_list;
	private Integer p_id;
	private List category_list; // 分類列表

	private File product_img;
	private String product_imgContentType;
	private String product_imgFileName;

	public void setProductCategoryService(IProductCategoryService productCategoryService) {
		this.productCategoryService = productCategoryService;
	}

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

	public String doAlert() {
		try {
			FileUtils.copyFile(product_img, new File("/Users/yvonne/Desktop/未命名檔案夾/CPBuy2/src/main/webapp/upload/", product_imgFileName));
			product.setImg_url("/Users/yvonne/Desktop/未命名檔案夾/CPBuy2/src/main/webapp/upload/" + product_imgFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (product.getId() == null) {
			productService.addProduct(product);
		}
		return "redirect_toList";
	}

	public void addCategory() {
		List c_list = new ArrayList<>();
		productCategoryService.addCategoryForProduct(c_list, p_id);
	}
}
