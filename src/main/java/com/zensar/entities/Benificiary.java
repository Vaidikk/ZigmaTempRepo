package com.zensar.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "benificiary")
public class Benificiary implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "benificiaryId", unique = true)
	private int benificiaryId;
	
	@ManyToOne(targetEntity = Account.class)
	@JoinColumn(name = "accountNumber", referencedColumnName = "accountNumber", nullable = false)
	private int accountNumber;
	
	@Column(name = "benificiaryIfsc", nullable = false)
	private String benificiaryIfsc;
	
	@Column(name = "nickname", nullable = false)
	private String nickname;
	
	public Benificiary() {
		// TODO Auto-generated constructor stub
	}

	public Benificiary(int benificiaryId, int accountNumber, String benificiaryIfsc, String nickname) {
		super();
		this.benificiaryId = benificiaryId;
		this.accountNumber = accountNumber;
		this.benificiaryIfsc = benificiaryIfsc;
		this.nickname = nickname;
	}

	public int getBenificiaryId() {
		return benificiaryId;
	}

	public void setBenificiaryId(int benificiaryId) {
		this.benificiaryId = benificiaryId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBenificiaryIfsc() {
		return benificiaryIfsc;
	}

	public void setBenificiaryIfsc(String benificiaryIfsc) {
		this.benificiaryIfsc = benificiaryIfsc;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
