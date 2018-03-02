package com.cpbuy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cpbuy.dao.ICategoryDao;
import com.cpbuy.model.Category;

import jdbc.dao.impl.PagingDaoImpl;

public class CategoryDaoImpl extends PagingDaoImpl implements ICategoryDao {

	/**
	 * 取得分類列表
	 * 
	 * @return
	 */
	public List getCategoryList(Integer up_id) {

		String sql = "SELECT * FROM CATEGORY WHERE 1=1 ";
		List args = new ArrayList();
		if (up_id != null) {
			sql += " AND UP_ID = ? ";
			args.add(up_id);
		}
		return jdbcTemplate.query(sql, args.toArray(), rowMapper);
	}

	/**
	 * 取得分類內容
	 * 
	 * @return
	 */
	public Category getCategoryByid(Integer id) {

		String sql = "SELECT * FROM CATEGORY WHERE ID = ? ";
		Category category = null;
		List list = jdbcTemplate.query(sql, new Object[] { id }, rowMapper);
		if (list != null && list.size() > 0) {
			category = (Category) list.get(0);
		}
		return category;
	}

	/**
	 * 新增分類
	 * 
	 * @param category
	 * @return
	 */
	public Integer addCategory(Category category) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO CATEGORY ( UP_ID, NAME, SORT, SHOW, ICON ) VALUES (?,?,?,?,?)");
		jdbcTemplate.update(sql.toString(), new Object[] { category.getUp_id(), category.getName(), category.getSort(),
				category.getShow(), category.getIcon() });
		return null;
	}

	/**
	 * 修改分類
	 * 
	 * @param category
	 */
	public void modifyCategory(Category category) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE CATEGORY SET UP_ID=?, NAME=?, SORT=?, SHOW=?, ICON=? WHERE ID=? ");
		jdbcTemplate.update(sql.toString(), new Object[] { category.getUp_id(), category.getName(), category.getSort(),
				category.getShow(), category.getIcon(), category.getId() });
	}

}
