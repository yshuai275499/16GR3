package com.qhit.lh.g3.acg.exam.tkgl.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;

import com.qhit.lh.g3.acg.exam.common.dao.BaseDao;
import com.qhit.lh.g3.acg.exam.kmgl.bean.Course;

public class QuestionDaoImpl extends BaseDao implements QuestionDao {

	@Override
	public List<Course> getCourseInfo(Map parameter) {
		StringBuffer hql = new StringBuffer();
		hql.append("select course from Course course where 1 = 1");
		//拼接HQL
		if(parameter.get("major") != null && !"".equals(parameter.get("major"))){
			hql.append(" and course.major = :major");
		}
		if(parameter.get("stage") != null && !"".equals(parameter.get("stage"))){
			hql.append(" and course.stage = :stage");
		}
		//获取查询器
		Query query = getSession().createQuery(hql.toString());
		//设置参数
		if(parameter.get("major") != null && !"".equals(parameter.get("major"))){
			query.setString("major", (String) parameter.get("major"));
		}
		if(parameter.get("stage") != null && !"".equals(parameter.get("stage"))){
			query.setString("stage", (String) parameter.get("stage"));
		}
		//执行查询
		return query.list();
	}

}
