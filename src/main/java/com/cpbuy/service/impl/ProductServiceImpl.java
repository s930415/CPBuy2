package com.cpbuy.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cpbuy.dao.IProductDao;
import com.cpbuy.model.Product;
import com.cpbuy.service.IProductService;;

public class ProductServiceImpl implements IProductService {

	private IProductDao productDao;

	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	/**
	 * 取得產品列表
	 * 
	 * @param product
	 * @return
	 */
	public List getList(Product product) {
		return productDao.getList(product);
	}

	/**
	 * 取得產品
	 * @param id
	 * @return
	 */
	public Product getProductByid(Integer id){
		return productDao.getProductByid(id);
	}
	
	/**
	 * 新增商品
	 * 
	 * @param product
	 * @return
	 */
	public Integer addProduct(Product product) {
		return productDao.addProduct(product);
	}

	/**
	 * 修改商品
	 * 
	 * @param product
	 * @return
	 */
	public Integer updateProduct(Product product) {
		return productDao.updateProduct(product);
	}
}
