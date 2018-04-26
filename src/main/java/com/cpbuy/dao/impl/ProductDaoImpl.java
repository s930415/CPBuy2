package com.cpbuy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cpbuy.model.Product;

public class ProductDaoImpl {

	public List getList(Product product) {
		StringBuilder sql = new StringBuilder();
		List args = new ArrayList();
		sql.append("SELECT * FROM PRODUCT WHERE 1=1 ");
		args.add(product.getName());
		args.add(product.getPrice());
		args.add(product.getContent());
		return null;
	}
	
	public Integer addProduct(Product product) {
		StringBuilder sql = new StringBuilder();
		List args = new ArrayList();
		sql.append("INSERT INTO PRODUCT (ID,NAME,PRICE,CONTENT) values (?,?,?,?,?)  ");
		args.add(product.getName());
		args.add(product.getPrice());
		args.add(product.getContent());
		return null;
	}
	
	public Integer updateProduct(Product product) {
		StringBuilder sql = new StringBuilder();
		List args = new ArrayList();
		sql.append("UPDATE PRODUCT SET NAME=?,PRICE=?,CONTENT=? WHERE ID=? ");
		args.add(product.getName());
		args.add(product.getPrice());
		args.add(product.getContent());
		args.add(product.getId()); 
		return null; 
	}

}