package com.cpbuy.dao;

import java.util.ArrayList;
import java.util.List;

import com.cpbuy.model.Product;

public interface IProductDao {

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
