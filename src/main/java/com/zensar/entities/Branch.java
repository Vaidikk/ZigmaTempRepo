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
	
}
