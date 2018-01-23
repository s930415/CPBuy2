<<<<<<< HEAD
package jdbc.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jdbc.dao.PagingDao;
import jdbc.dao.PagingQuery;

/**
 * @author Ray
 * 2013-03-08
 */
public class OraclePagingQuery implements PagingQuery {   

    /**
     * zero base
     */
    public List query(final String sql,
        final Object[] args,
        final int startPage, 
        final int pageCount,
        final PagingDao dao)
        throws Exception {

        List list = (args != null) ? new ArrayList(Arrays.asList(args)) : new ArrayList();
        int start = ((startPage - 1) * pageCount) + 1;
        int end = startPage * pageCount;
        list.add(new Integer(start));
        list.add(new Integer(end));

        return dao.query(getPagingSql(sql), list.toArray());
    }
    
    public List queryForList(final String sql,
            final Object[] args,
            final int startPage, 
            final int pageCount,
            final PagingDao dao)
            throws Exception {

            List list = (args != null) ? new ArrayList(Arrays.asList(args)) : new ArrayList();
            int start = ((startPage - 1) * pageCount) + 1;
            int end = startPage * pageCount;
            list.add(new Integer(start));
            list.add(new Integer(end));

            return dao.queryForList(getPagingSql(sql), list.toArray());
        }

    public List query(String sql, int startPage, int pageCount, PagingDao dao) throws Exception {
        return query(sql, null, startPage, pageCount, dao);
    }

    public String getPagingSql(final String sql) {
        return "select * from ( select row_.*, rownum rownum_ from (" + sql + ") row_ ) where rownum_ >= ? AND rownum_ <= ?";
    }
}