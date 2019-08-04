package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Account;
@Repository
public class AccountDaoImpl implements AccountDao {
	@Autowired
	HibernateTemplate ht;
	@Override
	public void insert(Account account) {
		// TODO Auto-generated method stub
		ht.save(account);
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		ht.update(account);
	}

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub
		ht.delete(account);
	}

	@Override
	public Account getByAccountNumber(int accountNumber) {
		// TODO Auto-generated method stub
		return ht.get(Account.class, accountNumber);
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return ht.loadAll(Account.class);
	}

}
