package com.zensar.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "adminLogin")
public class AdminLogin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "adminId", unique = true)
	private int adminId;
	
	@Column(name = "password", nullable = false)
	private String password;
	
}