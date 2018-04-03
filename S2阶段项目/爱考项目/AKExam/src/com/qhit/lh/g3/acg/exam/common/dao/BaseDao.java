/**
 * 
 */
package com.qhit.lh.g3.acg.exam.common.dao;

import org.hibernate.Session;

import com.qhit.lh.g3.acg.exam.common.utils.HibernateSessionFactory;

/**
 * @author admin
 * 2017年12月27日
 */
public class BaseDao {

	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
}
