package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Account;

public interface AccountDao {
	//actions for Account
		void insert(Account account);
		void update(Account account);
		void delete(Account account);
		Account getByAccountNumber(int accountNumber);
		List <Account> getAllAccounts();
}
