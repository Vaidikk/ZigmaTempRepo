package com.zensar.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "accountNumber", unique = true)
	private int accountNumber;
	
	@Column(name = "accountType", nullable = false)//Enum lagana hai
	private String accountType;
	
	@Column(name = "accountBalance", nullable = false)
	private double accountBalance;
	
	@Column(name = "accountTitle", nullable = false)
	private String accountTitle;
	
	@ManyToOne(targetEntity = Branch.class)
	@JoinColumn(name = "ifsc", referencedColumnName = "ifsc", nullable = false)
	private String ifsc;
	
}
