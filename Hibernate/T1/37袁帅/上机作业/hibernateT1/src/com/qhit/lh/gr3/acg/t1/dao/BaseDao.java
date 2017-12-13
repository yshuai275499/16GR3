/**
 * 
 */
package com.qhit.lh.gr3.acg.t1.dao;

import java.util.List;

/**
 * @author 袁帅
 * TODO
 * 2017-12-12下午7:39:48
 */
public interface BaseDao {
	
	/**
	 * @param obj
	 * @return
	 * 增
	 */
	public void add(Object obj);
	/**
	 * @param obj
	 * @return
	 * 删
	 */
	public void del(Object obj);
	/**
	 * @param obj
	 * @return
	 * 改
	 */
	public void upd(Object obj);
	/**
	 * @param obj
	 * @return
	 * 查
	 */
	public List<Object> getAll(String fromObject);
}