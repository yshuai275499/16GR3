/**
 * 
 */
package com.qhit.lh.gr3.acg.t2.dao;

import java.util.List;

/**
 * @author 袁帅
 * TODO
 * 2017-12-12下午7:39:48
 */
public interface BaseDao {
    public void add(Object obj);//添加
	
	public void update(Object obj);//修改
	
	public void delete(Object obj);//删除
	
	public List<Object> getall(String fromOdject);
	
	public Object getObjectById(Object obj,int id);
}
