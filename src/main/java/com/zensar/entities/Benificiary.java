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
	
}
