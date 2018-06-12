package com.cpbuy.service;

import java.util.List;

import com.cpbuy.model.Category;
import com.cpbuy.model.Product;;

public interface IProductService {
	/**
	 * 取得產品列表
	 * 
	 * @param product
	 * @return
	 */
	public List getList(Product product);

	/**
	 * 新增商品
	 * 
	 * @param product
	 * @return
	 */
	public Integer addProduct(Product product);

	/**
	 * 修改商品
	 * 
	 * @param product
	 * @return
	 */
	public Integer updateProduct(Product product);

}
