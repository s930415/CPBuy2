package com.cpbuy.action.admin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.cpbuy.model.Category;
import com.cpbuy.model.Product;
import com.cpbuy.service.ICategoryService;
import com.cpbuy.service.IProductCategoryService;
import com.cpbuy.service.IProductService;

public class ProductAction extends AdminBaseAction {
	private IProductService productService;
	private IProductCategoryService productCategoryService;
	private ICategoryService categoryService;
	
	//呈現用參數
	private Product product;
	private List<Category> c_list;
	private List pc_list;
	private List product_list;
	private Integer p_id;
	private List category_list; // 分類列表
	
	//搜尋用參數
	private Product s_product;	//搜尋用產品
	
	//圖片上傳用
	private File product_img;
	private String product_imgContentType;
	private String product_imgFileName;

	public List getPc_list() {
		return pc_list;
	}

	public void setPc_list(List pc_list) {
		this.pc_list = pc_list;
	}

	public void setCategoryService(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}

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
		c_list = productCategoryService.getListByProductId(p_id, null);
		return "toDetail";
	}

	public String doAlert() {
		try {
			FileUtils.copyFile(product_img,
					new File("/Users/yvonne/Desktop/未命名檔案夾/CPBuy2/src/main/webapp/upload/", product_imgFileName));
			product.setImg_url("/Users/yvonne/Desktop/未命名檔案夾/CPBuy2/src/main/webapp/upload/" + product_imgFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (product.getId() == null) {
			productService.addProduct(product);
		}
		return "redirect_toList";
	}
	/**
	 * 新增分類
	 */
	public void addCategory() {
		c_list = categoryService.getCategoryList(null);
	}
	/**
	 * 選擇分類
	 * @return
	 */
	public String selectCategory() {
//		c_list = categoryService.getCategoryList(null);
		pc_list = productCategoryService.getListByProductId(p_id, null);
		return "selectCategory";
	}
}
