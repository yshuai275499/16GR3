package com.qhit.lh.gr3.hm;

import com.qhit.lh.gr3.acg.bean.Dept;
import com.qhit.lh.gr3.acg.bean.Emp;

import com.qhit.lh.gr3.acg.service.BaseService;
import com.qhit.lh.gr3.acg.service.impl.BaseServiceImpl;

public class EmpText { 

	BaseService bs = new 	BaseServiceImpl();
	 	@org.junit.Test
	 	public void add(){
	 		Emp emp1 = new Emp();
	 		emp1.setEname("123456");
	 		emp1.setSex("F");
	 		Emp emp2 = new Emp();
	 		emp2.setEname("654321");
	 		emp2.setSex("F");
	 		//dept
	 		Dept dept = new Dept();
	 		dept.setDname("FBA");
	 		//n-1
	 		dept.getEmps().add(emp1);
	 		dept.getEmps().add(emp2);
	 		bs.add(dept);
	 	}
	
}
