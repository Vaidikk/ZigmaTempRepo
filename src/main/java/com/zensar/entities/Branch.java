package com.zensar.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "branch")
public class Branch implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "ifsc", unique = true)
	private String ifsc;
	
	@ManyToOne(targetEntity = AdminLogin.class)
	@JoinColumn(name = "adminId", referencedColumnName = "adminId", nullable = false)
	private int adminId;
	
	@Column(name = "branchName", nullable = false)
	private String branchName;
	
	@Column(name = "branchAddress", nullable = false)
	private String branchAddress;

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	
}
