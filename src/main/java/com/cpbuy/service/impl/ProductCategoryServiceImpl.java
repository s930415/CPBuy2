package com.cpbuy.service.impl;

import java.util.List;

import com.cpbuy.dao.IProductCategoryDao;
import com.cpbuy.service.IProductCategoryService;

import jdbc.dao.impl.PagingDaoImpl;

public class ProductCategoryServiceImpl extends PagingDaoImpl implements IProductCategoryService {

	IProductCategoryDao productCategoryDao;

	public void setProductCategoryDao(IProductCategoryDao productCategoryDao) {
		this.productCategoryDao = productCategoryDao;
	}

	/**
	 * 依照產品取得分類列表
	 * 
	 * @param product_id
	 * @param category_id
	 * @return
	 */
	public List getListByProductId(Integer product_id, Integer category_id) {
		return productCategoryDao.getListByProductId(product_id, category_id);
	}

	/**
	 * 增加分類
	 * 
	 * @param category_list
	 * @param prodcut_id
	 */
	public void addCategoryForProduct(List<Integer> category_list, Integer prodcut_id) {
		productCategoryDao.addCategoryForProduct(category_list, prodcut_id);
	}

	/**
	 * 清除分類
	 * 
	 * @param product_id
	 */
	public void clearCategoryByProdcutId(Integer product_id) {
		productCategoryDao.clearCategoryByProdcutId(product_id);
	}

	/**
	 * 刪除單項分類
	 * 
	 * @param product_id
	 * @param category_id
	 */
	public void deleteCategoryIdForProductId(Integer product_id, Integer category_id) {
		productCategoryDao.deleteCategoryIdForProductId(product_id, category_id);
	}

	/**
	 * 取得產品分類
	 * 
	 * @param product_id
	 * @return
	 */
	public List getProductCategory(Integer product_id) {
		return null;
	}

}