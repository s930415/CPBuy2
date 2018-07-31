package com.cpbuy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cpbuy.dao.ICategoryDao;
import com.cpbuy.dao.IProductDao;
import com.cpbuy.model.Product;

import jdbc.dao.impl.PagingDaoImpl;

public class ProductDaoImpl extends PagingDaoImpl implements IProductDao {
	/**
	 * 取得產品列表
	 * 
	 * @param product
	 * @return
	 */
	public List getList(Product product) {
		StringBuilder sql = new StringBuilder();
		List args = new ArrayList();
		sql.append("SELECT * FROM PRODUCT WHERE 1=1 ");
		if (product != null) {
			if (product.getName() != null && !product.getName().equals("")) {
				args.add("%" + product.getName() + "%");
				sql.append("AND NAME = ? ");
			}
			if (product.getName() != null && !product.getName().equals("")) {
				args.add(product.getContent());
				sql.append("AND CONTENT = ? ");
			}
			if (product.getName() != null && !product.getName().equals("")) {
				args.add(product.getPrice());
				sql.append("AND PRICE = ? ");
			}
		}
		List list = jdbcTemplate.queryForList(sql.toString(), args.toArray());
		return list;
	}

	/**
	 * 取得產品
	 * 
	 * @param id
	 * @return
	 */
	public Product getProductByid(Integer id) {
		Product product = null;
		String sql = "SELECT * FROM PRODUCT WHERE ID = ? ";
		List list = jdbcTemplate.queryForList(sql, new Object[] { id });
		if (list != null && list.size() > 0) {
			product = (Product) list.get(0);
		}
		return product;
	}

	/**
	 * 新增商品
	 * 
	 * @param product
	 * @return
	 */
	public Integer addProduct(Product product) {
		StringBuilder sql = new StringBuilder();
		List args = new ArrayList();
		sql.append("INSERT INTO PRODUCT (ID,NAME,PRICE,CONTENT) values (?,?,?,?,?)  ");
		args.add(product.getName());
		args.add(product.getPrice());
		args.add(product.getContent());
		return null;
	}

	/**
	 * 修改商品
	 * 
	 * @param product
	 * @return
	 */
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