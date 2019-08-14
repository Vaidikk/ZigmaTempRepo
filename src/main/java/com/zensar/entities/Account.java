package com.zensar.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accountNumber, String accountType, double accountBalance, String accountTitle, String ifsc) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.accountTitle = accountTitle;
		this.ifsc = ifsc;
	}

	@Id
    @Column(name = "accountNumber", unique = true)
	private int accountNumber;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "accountType", nullable = false)//Enum lagana hai
	private String accountType;
	
	@Column(name = "accountBalance", nullable = false)
	private double accountBalance;
	
	@Column(name = "accountTitle", nullable = false)
	private String accountTitle;
	
	
	@OneToOne
	@JoinColumn(name = "customerId", referencedColumnName = "customerId", nullable = false)
	private Customer customer;
	
	@ManyToOne(targetEntity = Branch.class)
	@JoinColumn(name = "ifsc", referencedColumnName = "ifsc", nullable = false)
	private String ifsc;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountTitle() {
		return accountTitle;
	}

	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
