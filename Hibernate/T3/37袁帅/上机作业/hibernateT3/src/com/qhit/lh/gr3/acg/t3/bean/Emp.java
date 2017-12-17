package com.qhit.lh.gr3.acg.t3.bean;

public class Emp {
	private int id;
	private String ename;
	private String sex;
	private String age;
	
	private Dept dept;
	
	private User user;//一对一关系属性；

	public Emp(int id, String ename, String sex, String age, User user) {
		super();
		this.id = id;
		this.ename = ename;
		this.sex = sex;
		this.age = age;
		this.user = user;
	}

	public Emp() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
