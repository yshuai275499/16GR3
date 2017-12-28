package com.qhit.lh.gr3.acg;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.qhit.lh.gr3.acg.bean.Emp;
import com.qhit.lh.gr3.acg.utils.HibernateSessionFactory;
public class Test {
   //按员工姓名模糊查询
	@org.junit.Test
	public void EmpTest(){
		String hql = "select e from Emp e where e.ename like ?";
		
		Session session = HibernateSessionFactory.getSession();
		
		Query query = session.createQuery(hql);
		query.setString(0, "%张%");
		
		List<Emp> result = query.list();
		
		for (Emp emp : result) {
			System.out.println(emp.getEname());
		}
	}


}
