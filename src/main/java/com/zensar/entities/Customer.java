package com.zensar.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "customerId", unique = true)
	private int customerId;
	
	@ManyToOne(targetEntity = CustomerLogin.class)
	@JoinColumn(name = "crn", referencedColumnName = "crn", nullable = false)
	private int crn;
	
	@ManyToOne(targetEntity = Account.class)
	@JoinColumn(name = "accountNumber", referencedColumnName = "accountNumber", nullable = false)
	private int accountNumber;
	
	@Column(name = "customerName", nullable = false)
	private String customerName;
	
	@Column(name = "mobileNumber", nullable = false)
	private int mobileNumber;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "aadhar", nullable = false)
	private int aadhar;
}
