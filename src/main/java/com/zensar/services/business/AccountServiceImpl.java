package com.zensar.services.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.AccountDao;
import com.zensar.entities.Account;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	private AccountDao dao;
	@Override
	public void create(Account account) {
		// TODO Auto-generated method stub
		dao.insert(account);
	}

	@Override
	public void edit(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account findAccountById(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
