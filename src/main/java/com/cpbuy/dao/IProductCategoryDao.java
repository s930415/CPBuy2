package com.cpbuy.dao;

import java.util.List;

public interface IProductCategoryDao {

	/**
	 * 依照產品取得分類列表
	 * 
	 * @param product_id
	 * @param category_id
	 * @return
	 */
	public List getListByProductId(Integer product_id, Integer category_id);

	/**
	 * 增加分類
	 * 
	 * @param category_list
	 * @param prodcut_id
	 */
	public void addCategoryForProduct(List<Integer> category_list, Integer prodcut_id);

	/**
	 * 清除分類
	 * 
	 * @param product_id
	 */
	public void clearCategoryByProdcutId(Integer product_id);

	/**
	 * 刪除單項分類
	 * 
	 * @param product_id
	 * @param category_id
	 * @return
	 */
	public void deleteCategoryIdForProductId(Integer product_id, Integer category_id);
	
	/**
	 * 取得產品分類
	 * 
	 * @param product_id
	 * @return
	 */
	public List getProductCategory(Integer product_id) ;

}
