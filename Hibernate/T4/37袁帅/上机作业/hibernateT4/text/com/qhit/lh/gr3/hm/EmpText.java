package com.qhit.lh.gr3.hm;


import org.junit.Test;

import com.qhit.lh.gr3.acg.bean.Dept;
import com.qhit.lh.gr3.acg.bean.Emp;
import com.qhit.lh.gr3.acg.bean.User;
import com.qhit.lh.gr3.acg.service.BaseService;
import com.qhit.lh.gr3.acg.service.impl.BaseServiceImpl;

public class EmpText {
	private BaseService bs = new BaseServiceImpl();

	@Test
	public void add(){
		
		Emp emp = new Emp();
		emp.setEname("王大头");
		User user = new User();
		user.setUname("admin");
		user.setUname("123456");
		//部门
		Dept dept = (Dept) bs.getObjectById(Dept.class, 1);
		
		//1-1
		emp.setUser(user);
		user.setEmp(emp);
		//n-1
		emp.setDept(dept);
		
		bs.add(emp);
	}
	
}
