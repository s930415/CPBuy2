package com.cpbuy.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

import com.cpbuy.dao.IProductCategoryDao;
import com.cpbuy.model.Category;

import jdbc.dao.impl.PagingDaoImpl;

public class ProductCategoryDaoImpl extends PagingDaoImpl implements IProductCategoryDao {
	/**
	 * 依照產品取得分類列表
	 * @param product_id
	 * @param category_id
	 * @return
	 */
	public List getListByProductId(Integer product_id, Integer category_id) {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT C.* FROM PRODUCT_CATEGORY PC JOIN CATEGORY C ON PC.CATEGORY_ID = C.ID WHERE WHERE 1 = 1 ");
		if (product_id != null) {
			sql.append("AND PRODUCT_ID = ? ");
		}
		List<Category> list = jdbcTemplate.queryForList(sql.toString(), new Object[] { product_id }, com.cpbuy.model.Category.class);
		return list;
	}
	
	/**
	 * 增加分類
	 * @param category_list
	 * @param prodcut_id
	 */
	public void addCategoryForProduct(List<Integer> category_list, Integer product_id) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO PRODUCT_CATEGORY ( PRODUCT_ID, CATEGORY_ID) VALUES ( " + product_id + ", ?) ");
		jdbcTemplate.batchUpdate(sql.toString(), new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Integer category_id = category_list.get(i);
				ps.setInt(1, category_id);
			}

			@Override
			public int getBatchSize() {
				return category_list.size();
			}
		});
	}
	
	/**
	 * 清除分類
	 * @param product_id
	 */
	public void clearCategoryByProdcutId(Integer product_id) {
		String sql = "DELETE FROM PRODUCT_CATEGORY WHERE WHERE PRODUCT_ID = ? ";
		jdbcTemplate.update(sql, new Object[] { product_id });
	}
	
	/**
	 * 刪除單項分類
	 * @param product_id
	 * @param category_id
	 * @return
	 */
	public void deleteCategoryIdForProductId(Integer product_id, Integer category_id) {
		String sql = "DELETE FROM PRODUCT_CATEGORY WHERE WHERE PRODUCT_ID = ? AND CATEGORY_ID = ? ";
		jdbcTemplate.update(sql, new Object[] { product_id, category_id });
	}

}