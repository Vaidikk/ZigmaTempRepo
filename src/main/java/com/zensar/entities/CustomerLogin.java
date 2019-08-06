package com.zensar.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "customer_login")
public class CustomerLogin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "crn", unique = true)
	private int crn;
	
	@Column(name = "password", nullable = false)
	private String password;

	public CustomerLogin() {
		// TODO Auto-generated constructor stub
	}

	public CustomerLogin(int crn, String password) {
		super();
		this.crn = crn;
		this.password = password;
	}

	public int getCrn() {
		return crn;
	}

	public void setCrn(int crn) {
		this.crn = crn;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
