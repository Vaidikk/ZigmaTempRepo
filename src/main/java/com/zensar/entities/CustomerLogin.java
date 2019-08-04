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
	
}
