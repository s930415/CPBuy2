package jdbc.dao;

import java.util.List;

public interface PagingDao {

	/**
	 * zero base
	 */
	List query(final String sqll)throws Exception;
	
	List query(String sqll,Object[] args)throws Exception;

	/**
	 * zero base
	 */
	List queryForList(String sql, Object[] args) throws Exception;

	/**
	 * zero base
	 */	
	List query(String sql,Object[] args, int startPage, int pageCount)throws Exception;
	
	List query(String sql,int startPage, int pageCount)throws Exception;
}