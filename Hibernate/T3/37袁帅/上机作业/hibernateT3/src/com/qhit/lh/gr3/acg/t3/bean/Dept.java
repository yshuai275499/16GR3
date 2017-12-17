package com.qhit.lh.gr3.acg.t3.bean;

public class Dept {

	private Integer oid;
	private String dname;
	private String address;
	public Dept(Integer oid, String dname, String address) {
		super();
		this.oid = oid;
		this.dname = dname;
		this.address = address;
	}
	public Dept() {
		super();
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
