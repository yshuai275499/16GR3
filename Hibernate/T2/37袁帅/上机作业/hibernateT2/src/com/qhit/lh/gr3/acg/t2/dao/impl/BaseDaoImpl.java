/**
 * 
 */
package com.qhit.lh.gr3.acg.t2.dao.impl;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.acg.t2.dao.BaseDao;
import com.qhit.lh.gr3.acg.t2.utils.HibernateSessionFactory;
/**
 * @author 袁帅
 * TODO
 * 2017-12-12下午7:41:30
 */
public class BaseDaoImpl implements BaseDao {
	
	@Override
	public void add(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行
		session.save(obj);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public void update(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行
		session.update(obj);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public void delete(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行
		session.delete(obj);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public List<Object> getall(String fromOdject) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//获取查询器对象
		Query query = session.createQuery(fromOdject);
		List<Object> list = query.list();
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		return list;
	}
	@Override
	public Object getObjectById(Object obj, int id) {
		// 获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//获取查询器对象
		obj = session.get(obj.getClass(), id);
		// 提交事务
		ts.commit();
		// 释放资源
		HibernateSessionFactory.closeSession();
		return obj;
	}
}
