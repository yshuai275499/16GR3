package test;

import java.util.List;

import com.qhit.lh.gr3.acg.t2.bean.Emp;
import com.qhit.lh.gr3.acg.t2.bean.User;
import com.qhit.lh.gr3.acg.t2.service.BaseService;
import com.qhit.lh.gr3.acg.t2.service.impl.BaseServiceImpl;

public class Test {
	private BaseService bs=new BaseServiceImpl();
	@org.junit.Test
	public void add(){
		Emp emp = new Emp();
		emp.setEname("JT");
		emp.setSex("男");
		emp.setAge("M");
		emp.setId(1);
		
		User user = new User();
		emp.setEname("admin");
		
		
		user.setEmp(emp);
		emp.setUser(user);
		
		bs.add(emp);
	}
	public void update(){
		Emp emp = new Emp();
		emp.setId(2);
		emp.setEname("mot");
		emp.setSex("f");
		emp.setId(0);
		
	   User user = new User();
	   user.setUname("mot");
		
		
		
		emp.setUser(user);
		user.setEmp(emp);
		
		bs.update(emp);
		
	}
   public void delete(){
		User user = new User();
		user = (User) bs.getObjectById(user, 2);
		bs.delete(user);
		
	}
	public void query(){
		List<Object> list = bs.getall("from emp");
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
		
	}


}
