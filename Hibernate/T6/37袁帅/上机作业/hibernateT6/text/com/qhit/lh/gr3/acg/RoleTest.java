package com.qhit.lh.gr3.acg;

import org.junit.Test;

import com.qhit.lh.gr3.acg.bean.Role;
import com.qhit.lh.gr3.acg.bean.User;
import com.qhit.lh.gr3.acg.service.BaseService;
import com.qhit.lh.gr3.acg.service.impl.BaseServiceImpl;

public class RoleTest {
	BaseService bs = new BaseServiceImpl();
	@Test
	public void add(){
	Role role = new Role();
	role.setRoleName("妇女主席");
	User user = (User) bs.getObjectById(User.class, 1);
	role.getUsers().add(user);
	bs.add(role);
	}
	@Test
	public void del(){
		Role role = (Role) bs.getObjectById(Role.class, 2);
		bs.delete(role);
	}
	@Test
	public void select(){
		Role role = (Role) bs.getObjectById(Role.class, 3);
		for (User user : role.getUsers()) {
			System.out.println(user.getUname()+":"+user.getUid());
		}
	}
}
