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
	
	@ManyToOne
	@JoinColumn(name = "crn", referencedColumnName = "crn", nullable = true)
	private CustomerLogin customerLogin;
	
	@OneToOne
	@JoinColumn(name = "accountNumber", referencedColumnName = "accountNumber", nullable = true)
	private Account account;
	
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
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}	

	/*
	 * public Customer(int customerId, int crn, int accountNumber, String
	 * customerName, int mobileNumber, String email, String address, int aadhar) {
	 * super(); this.customerId = customerId; this.crn = crn; this.accountNumber =
	 * accountNumber; this.customerName = customerName; this.mobileNumber =
	 * mobileNumber; this.email = email; this.address = address; this.aadhar =
	 * aadhar; }
	 */

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/*
	 * public int getCrn() { return crn; }
	 * 
	 * public void setCrn(int crn) { this.crn = crn; }
	 * 
	 * public int getAccountNumber() { return accountNumber; }
	 * 
	 * public void setAccountNumber(int accountNumber) { this.accountNumber =
	 * accountNumber; }
	 */

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAadhar() {
		return aadhar;
	}

	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CustomerLogin getCustomerLogin() {
		return customerLogin;
	}

	public void setCustomerLogin(CustomerLogin customerLogin) {
		this.customerLogin = customerLogin;
	}

	public Account getAccount() {
		return account;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerLogin=" + customerLogin + ", account=" + account
				+ ", customerName=" + customerName + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", address=" + address + ", aadhar=" + aadhar + "]";
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
