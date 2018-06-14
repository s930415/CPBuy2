package com.cpbuy.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cpbuy.dao.IProductDao;
import com.cpbuy.model.Product;
import com.cpbuy.service.IProductService;

import jdbc.dao.impl.PagingDaoImpl;

public class ProductServiceImpl implements IProductService {

	IProductDao productDao;

	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	public List getList(Product product) {
		return productDao.getList(product);
	}

	public Integer addProduct(Product product) {

		return productDao.addProduct(product);
	}

	public Integer updateProduct(Product product) {
		return productDao.updateProduct(product);
	}

}
