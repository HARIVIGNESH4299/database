package com.pizzahut.model;

import java.util.Objects;

public class User {
	private String username;
	private long phonenumber;
	private String email;
	private String address;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String username, long phonenumber, String email, String address,String password) {
		super();
		this.username = username;
		this.phonenumber = phonenumber;
		this.email = email;
		this.address = address;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String string, String emailid) {
		this.username=string;
		this.email=emailid;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", phonenumber=" + phonenumber + ", email=" + email + ", address="
				+ address + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, email, password, phonenumber, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(password, other.password) && phonenumber == other.phonenumber
				&& Objects.equals(username, other.username);
	}

	
	
}
