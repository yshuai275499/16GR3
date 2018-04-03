package com.qhit.lh.g3.acg.exam.tkgl.bean;

import com.qhit.lh.g3.acg.exam.kmgl.bean.Course;

/**
 * WrittenTest entity. @author MyEclipse Persistence Tools
 */

public class WrittenTest implements java.io.Serializable {

	// Fields

	private Integer qid;
	private String qtype;
	private String qtitle;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;
	private String degree;
	private Integer qsId;
	private String chapter;
	
	//n-1
	private Course course;

	// Constructors

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	/** default constructor */
	public WrittenTest() {
	}

	/** minimal constructor */
	public WrittenTest(String qtype, String qtitle, String optionA,
			String optionB, String optionC, String optionD, String degree,
			Integer qsId) {
		this.qtype = qtype;
		this.qtitle = qtitle;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.degree = degree;
		this.qsId = qsId;
	}

	/** full constructor */
	public WrittenTest(String qtype, String qtitle, String optionA,
			String optionB, String optionC, String optionD, String answer,
			String degree, Integer qsId, String chapter) {
		this.qtype = qtype;
		this.qtitle = qtitle;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
		this.degree = degree;
		this.qsId = qsId;
		this.chapter = chapter;
	}

	// Property accessors

	public Integer getQid() {
		return this.qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	public String getQtype() {
		return this.qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public String getQtitle() {
		return this.qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}

	public String getOptionA() {
		return this.optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return this.optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return this.optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return this.optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getQsId() {
		return this.qsId;
	}

	public void setQsId(Integer qsId) {
		this.qsId = qsId;
	}

	public String getChapter() {
		return this.chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

}