package com.client2.model;

public class EmployeeVO {
private Integer empid;
private String empname;
private String empaddr;

public EmployeeVO() {
	
}

public EmployeeVO(Integer n,String nm,String adr)
{
	this.empid=n;
	this.empname=nm;
	this.empaddr=adr;
}


public Integer getEmpid() {
	return empid;
}
public void setEmpid(Integer empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpaddr() {
	return empaddr;
}
public void setEmpaddr(String empaddr) {
	this.empaddr = empaddr;
}



}
