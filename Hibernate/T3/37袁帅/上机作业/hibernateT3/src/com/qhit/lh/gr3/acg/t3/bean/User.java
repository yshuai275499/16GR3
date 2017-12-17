/**
 * 
 */
package com.qhit.lh.gr3.acg.t3.bean;

/**
 * @author 袁帅
 * TODO
 * 2017-12-12下午7:53:58
 */
public class User {
	 private Integer uid;
     private String uname;
     private String upwd;
     
     private Emp emp;

	public User(Integer uid, String uname, String upwd, Emp emp) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.emp = emp;
	}

	public User() {
		super();
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	
}
