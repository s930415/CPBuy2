<<<<<<< HEAD
package jdbc.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dao.PagingDao;
import jdbc.dao.PagingQuery;

/**
 * @author Ray
 * 2013-03-08
 */
public class PagingDaoImpl implements PagingDao {
	private static final Log log = LogFactory.getLog(PagingDaoImpl.class);   
	
    protected JdbcTemplate jdbcTemplate;
    protected RowMapper rowMapper;
    protected PagingQuery pagingQuery;

    public List query(final String sql) throws Exception {
        return getJdbcTemplate().query(sql, getRowMapper());
    }

    public List query(final String sql, final Object[] args) throws Exception {
        return getJdbcTemplate().query(sql, args, getRowMapper());
    }
    
    public List queryForList(final String sql, final Object[] args) throws Exception {
        return getJdbcTemplate().queryForList(sql, args);
    }

    /**
     * zero base
     */
    public List query(final String sql, final Object[] args, final int start, final int end) throws Exception {
        return pagingQuery.query(sql, args, start, end, this);
    }
    
    /**
     * zero base
     */
    public List queryForList(final String sql, final Object[] args, final int start, final int end) throws Exception {
        return pagingQuery.queryForList(sql, args, start, end, this);
    }

    /**
     * zero base
     */
    public List query(final String sql, final int start, final int end) throws Exception {
        return pagingQuery.query(sql, start, end, this);
    }

    /**
     * @return the jdbcTemplate
     */
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    /**
     * @param jdbcTemplate the jdbcTemplate to set
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * @return the rowMapper
     */
    public RowMapper getRowMapper() {
        return rowMapper;
    }

    /**
     * @param rowMapper the rowMapper to set
     */
    public void setRowMapper(RowMapper rowMapper) {
        this.rowMapper = rowMapper;
    }

    /**
     * @return the pagingQuery
     */
    public PagingQuery getPagingQuery() {
        return pagingQuery;
    }

    /**
     * @param pagingQuery the pagingQuery to set
     */
    public void setPagingQuery(PagingQuery pagingQuery) {
        this.pagingQuery = pagingQuery;
    }
}