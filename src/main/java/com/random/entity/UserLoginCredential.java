package com.random.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserLoginCredential {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String email;
	
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
	
	public UserLoginCredential() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserLoginCredential(int userid, String email, String password) {
		super();
		this.userId = userid;
		this.email = email;
		this.password = password;
	}
	
	
	public UserLoginCredential(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public int getUserid() {
		return userId;
	}
	public void setUserid(int userid) {
		this.userId = userid;
	}

	@Override
	public String toString() {
		return "UserLoginCredential [email=" + email + ", password=" + password + "]";
	}
	
	
	
}
