package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Account;
import com.zensar.entities.Customer;


public interface AccountService {
	void create(Account account);
	void edit(Account account);
	void remove(Account account);
	Account findAccountById(int accountNumber);
	List<Account> findAllAccounts();
	
	Account findAccountByCustomer(Customer customer);
	
	List<Account> findAllAccountsByType(String accountType);
	
	void debit(Account account);
	void credit(Account account);
}