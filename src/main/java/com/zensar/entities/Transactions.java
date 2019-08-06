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
	
	public Transactions() {
		// TODO Auto-generated constructor stub
	}

	public Transactions(int transactionId, int accountNumber, String transactionType, String transactionMode,
			String transactionTime, double transactionAmount, int recieverAccountNumber) {
		super();
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.transactionType = transactionType;
		this.transactionMode = transactionMode;
		this.transactionTime = transactionTime;
		this.transactionAmount = transactionAmount;
		this.recieverAccountNumber = recieverAccountNumber;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public int getRecieverAccountNumber() {
		return recieverAccountNumber;
	}

	public void setRecieverAccountNumber(int recieverAccountNumber) {
		this.recieverAccountNumber = recieverAccountNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
