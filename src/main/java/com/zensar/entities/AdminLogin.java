package com.zensar.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "admin_login")
public class AdminLogin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "adminId", unique = true)
	private int adminId;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	public AdminLogin() {
		// TODO Auto-generated constructor stub
	}

	public AdminLogin(int adminId, String password) {
		super();
		this.adminId = adminId;
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
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

	@Override
	public String toString() {
		return "AdminLogin [adminId=" + adminId + ", password=" + password + "]";
	}
	
	
	
}