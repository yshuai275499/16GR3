
/**
 * 
 */
package com.qhit.lh.gr3.acg;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.qhit.lh.gr3.acg.bean.Dept;
import com.qhit.lh.gr3.acg.bean.Emp;
import com.qhit.lh.gr3.acg.bean.User;
import com.qhit.lh.gr3.acg.service.BaseService;
import com.qhit.lh.gr3.acg.service.impl.BaseServiceImpl;
import com.qhit.lh.gr3.acg.utils.HibernateSessionFactory;



/**
 * @author 袁帅
 * 2017年12月24日
 */
public class DeptTest {
	BaseService bs = new 	BaseServiceImpl();
	@org.junit.Test
	
	public void add(){
		Emp emp1 = new Emp();
		emp1.setEname("斯坦李");
		emp1.setSex("M");
		User user = new User();
		user.setUname("1111");
		user.setUpwd("123456");
		//1_1
		emp1.setUser(user);
		user.setEmp(emp1);
		Dept dept = new Dept();
		dept.setDname("学校");
		dept.getEmps().add(emp1);
		bs.add(dept);
	}
	
	@org.junit.Test
	public void select(){
		Session session = HibernateSessionFactory.getSession();	
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.eq("ename", "123456"));
		for(Object o :criteria.list()){
		System.out.println(o);
		}
	}
	@org.junit.Test
	public void select2(){
		Session session = HibernateSessionFactory.getSession();	
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.eq("ename", "123456"));
		List<Emp> list = criteria.list();
		for (Emp emp : list) {
			System.out.println(emp.getEname());
		}
		
		
	}
	/**
	 * id
	 */
	@org.junit.Test
	public void query(){
		Dept dept = (Dept) bs.getObjectById(Dept.class, 1);
		for(Emp emp:dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
	/**
	 * 名字模糊
	 */
	@org.junit.Test
	public void sel(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria =session.createCriteria(Emp.class)
					.add(Restrictions.like("ename", "1111%"));
			List<Emp> list = criteria.list();
			for (Emp emp : list) {
				System.out.println(emp.getEname()+emp.getSex()+emp.getDid());
			}
	
	
	}
}