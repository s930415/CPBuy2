package com.cpbuy.dao;

import java.util.List;

import com.cpbuy.model.Product;

public interface IProductDao {

	public List getList(Product product);

	public Integer addProduct(Product product);

	public Integer updateProduct(Product product);

}
