package com.atmecs.foodservice;

public class OrderDetails {

	
	
	 String empid;
	 String empname;
	 String deskno;
	 String code;
	 
	 public OrderDetails() {
		super();
	}
	 
	 
	public OrderDetails(String empid, String empname, String deskno, String code) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.deskno = deskno;
		this.code = code;
	}


	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDeskno() {
		return deskno;
	}
	public void setDeskno(String deskno) {
		this.deskno = deskno;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}


	@Override
	public String toString() {
		return "OrderDetails [empid=" + empid + ", empname=" + empname + ", deskno=" + deskno + ", code=" + code + "]";
	}
	
	
	
}
