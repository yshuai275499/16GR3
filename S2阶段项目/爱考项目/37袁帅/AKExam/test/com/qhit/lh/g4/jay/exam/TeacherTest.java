/**
 * 
 */
package com.qhit.lh.g4.jay.exam;

import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.lh.g3.acg.exam.common.bean.Teacher;
import com.qhit.lh.g3.acg.exam.common.bean.User;
import com.qhit.lh.g3.acg.exam.common.dao.BaseDao;

/**
 * @author admin
 * 2017年12月27日
 */
public class TeacherTest extends BaseDao {
	
	@Test
	public void add(){
		Teacher teacher = new Teacher();
		teacher.setTname("张亚辉");
		teacher.setSex("女");
		teacher.setPost("辅导员");
		
		User user = new User();
		user.setName("150202");
		user.setPwd("123456");
		user.setRole(2);
		
		teacher.setUser(user);
		
		Transaction ts = getSession().beginTransaction();
		getSession().save(teacher);
		ts.commit();
		
		
	}
}
