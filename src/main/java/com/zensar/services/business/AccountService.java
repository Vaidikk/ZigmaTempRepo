package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Account;


public interface AccountService {
	void create(Account account);
	void edit(Account account);
	void remove(Account account);
	Account findAccountById(int accountNumber);
	List<Account> findAllAccounts();
}