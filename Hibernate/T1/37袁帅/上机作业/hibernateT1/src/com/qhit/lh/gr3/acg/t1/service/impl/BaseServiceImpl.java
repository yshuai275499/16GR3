/**
 * 
 */
package com.qhit.lh.gr3.acg.t1.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.acg.t1.dao.BaseDao;
import com.qhit.lh.gr3.acg.t1.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.acg.t1.service.BaseService;
import com.qhit.lh.gr3.acg.t1.utils.HibernateSessionFactory;
/**
 * @author 袁帅
 * TODO
 * 2017-12-12下午7:48:27
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	@Override
	public void add(Object obj) {
		baseDao.add(obj);
	}

	@Override
	public void del(Object obj) {
		baseDao.del(obj);
	}

	@Override
	public void upd(Object obj) {
		baseDao.upd(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		return baseDao.getAll(fromObject);
	}

}