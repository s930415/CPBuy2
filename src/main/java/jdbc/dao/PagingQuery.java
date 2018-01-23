package jdbc.dao;

import java.util.List;

/**
 * @author Ray
 * 2013-03-08
 */
public interface PagingQuery {
    
    /**
     * zero base
     * dao must support function : public List query(String sql, Object[] args);
     */
    List query(String sql, Object[] args, int start, int end, PagingDao dao) throws Exception;
    
    List queryForList(String sql, Object[] args, int start, int end, PagingDao dao) throws Exception;

    /**
     * zero base
     * dao must support function : public List query(String sql, Object[] args);
     */
    List query(String sql, int start, int end, PagingDao dao) throws Exception;

    String getPagingSql(String sql);
}
