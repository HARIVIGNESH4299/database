package com.pizzahut.model;

import java.util.Objects;

public class Employees {
	private int empid;
	private String empname;
	private String email;
	private long phonenumber;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Employees(int empid, String empname, String email, long phonenumber) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employees [empid=" + empid + ", empname=" + empname + ", email=" + email + ", phonenumber="
				+ phonenumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, empid, empname, phonenumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return Objects.equals(email, other.email) && empid == other.empid && Objects.equals(empname, other.empname)
				&& phonenumber == other.phonenumber;
	}
	
}
