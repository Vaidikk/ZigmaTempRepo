package com.zensar.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class Transactions implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "transactionId", unique = true)
	private int transactionId;
	
	@ManyToOne(targetEntity = Account.class)
	@JoinColumn(name = "accountNumber", referencedColumnName = "accountNumber", nullable = false)
	private int accountNumber;
	
	@Column(name = "transactionType", nullable = false)//Enum lagana hai
	private String transactionType;
	
	@Column(name = "transactionMode", nullable = false)//Enum lagana hai
	private String transactionMode;
	
	@Column(name = "transactionTime", nullable = false)
	private String transactionTime;//Date type banana
	
	@Column(name = "transactionAmount", nullable = false)
	private double transactionAmount;
	
	@Column(name = "recieverAccountNumber", nullable = false)
	private int recieverAccountNumber;
	
}
