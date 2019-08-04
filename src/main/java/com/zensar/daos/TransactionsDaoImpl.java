package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.zensar.entities.Transactions;

public class TransactionsDaoImpl implements TransactionsDao {
	@Autowired
	HibernateTemplate ht;
	@Override
	public void insert(Transactions transactions) {
		// TODO Auto-generated method stub
		ht.save(transactions);
	}

	@Override
	public void update(Transactions transactions) {
		// TODO Auto-generated method stub
		ht.update(transactions);
	}

	@Override
	public void delete(Transactions transactions) {
		// TODO Auto-generated method stub
		ht.delete(transactions);
	}

	@Override
	public Transactions getByTransactionId(int transactionId) {
		// TODO Auto-generated method stub
		return ht.get(Transactions.class, transactionId);
	}

	@Override
	public List<Transactions> getAllTransactions() {
		// TODO Auto-generated method stub
		return ht.loadAll(Transactions.class);
	}

}
