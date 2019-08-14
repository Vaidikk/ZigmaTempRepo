package com.zensar.services.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.AccountDao;
import com.zensar.entities.Account;
import com.zensar.entities.Customer;

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
		Account dbAccount=findAccountById(account.getAccountNumber());
		if(dbAccount!=null){
			dbAccount.setAccountBalance(account.getAccountBalance());
			dbAccount.setAccountNumber(account.getAccountNumber());
			dbAccount.setAccountTitle(account.getAccountTitle());
			dbAccount.setAccountType(account.getAccountType());
			dao.update(dbAccount);
		}
		else
			System.out.println("Sorry! Account does not exist.");
	}

	@Override
	public void remove(Account account) {
		// TODO Auto-generated method stub
		Account dbAccount=findAccountById(account.getAccountNumber());
		if(dbAccount!=null){
			
			dao.delete(dbAccount);
		}
		else
			System.out.println("Sorry! Account does not exist.");
	}

	@Override
	public Account findAccountById(int accountNumber) {
		// TODO Auto-generated method stub
		return dao.getByAccountNumber(accountNumber);
	}

	@Override
	public List<Account> findAllAccounts() {
		// TODO Auto-generated method stub
		return dao.getAllAccounts();
	}
	
	

	@Override
	public Account findAccountByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		for(Account acc: findAllAccounts()) {
			if(acc.getCustomer().equals(customer))
				return acc;
		}
		return null;
	}

	@Override
	public List<Account> findAllAccountsByType(String accountType) {
		// TODO Auto-generated method stub
		
		List<Account> list = new ArrayList<Account>();
		
		for(Account acc: findAllAccounts()) {
			if(acc.getAccountType().equals(accountType))
				list.add(acc);
		}
		return list;
	}

	@Override
	public void debit(Account account) {
		// TODO Auto-generated method stub
		
		Account dbAccount = findAccountById(account.getAccountNumber());
		dbAccount.setAccountBalance(dbAccount.getAccountBalance()-account.getAccountBalance());
		edit(dbAccount);
	}

	@Override
	public void credit(Account account) {
		// TODO Auto-generated method stub
		
		Account dbAccount = findAccountById(account.getAccountNumber());
		dbAccount.setAccountBalance(dbAccount.getAccountBalance()+account.getAccountBalance());
		edit(dbAccount);
		
	}

}
