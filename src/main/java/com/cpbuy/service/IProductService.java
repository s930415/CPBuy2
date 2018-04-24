package com.cpbuy.service;

import java.util.List;

import com.cpbuy.model.Product;

public interface IProductService {

	public List getList(Product product);

	public Integer addProduct(Product product);

	public Integer updateProduct(Product product);

}
