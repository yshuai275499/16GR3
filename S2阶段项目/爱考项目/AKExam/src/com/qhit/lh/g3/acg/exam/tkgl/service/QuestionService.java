package com.qhit.lh.g3.acg.exam.tkgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g3.acg.exam.kmgl.bean.Course;

public interface QuestionService {

	/**
	 * 题库管理
	 * @param mjId
	 * @param stage
	 * @return
	 * 题库列表
	 */
	public List<Course> getCourseInfo(Map parameter);
}
