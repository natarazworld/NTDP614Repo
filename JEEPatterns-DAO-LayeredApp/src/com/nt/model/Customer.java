package com.nt.model;

import java.io.Serializable;


public class Customer implements Serializable{
	private int cid;
	private String cname;
	private  String cadd;
	private  float billAmt;
	
	//setters and getters
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public float getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}
	
	
	

}
