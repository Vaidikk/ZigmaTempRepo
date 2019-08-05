package com.zensar.services.business;

import java.util.List;

import com.zensar.daos.TransactionsDao;
import com.zensar.entities.Transactions;

public class TransactionsServicesImpl implements TransactionsService {
	private TransactionsDao dao;
	@Override
	public void create(Transactions transactions) {
		// TODO Auto-generated method stub
		dao.insert(transactions);
	}

	@Override
	public void edit(Transactions transactions) {
		// TODO Auto-generated method stub
		Transactions dbTransaction=findTransactionsById(transactions.getTransactionId());
		if(dbTransaction!=null) {
			dbTransaction.setAccountNumber(transactions.getTransactionId());
			dbTransaction.setRecieverAccountNumber(transactions.getRecieverAccountNumber());
			dbTransaction.setTransactionAmount(transactions.getTransactionAmount());
			dbTransaction.setTransactionMode(transactions.getTransactionMode());
			dbTransaction.setTransactionTime(transactions.getTransactionTime());
			dbTransaction.setTransactionType(transactions.getTransactionType());
			dao.update(dbTransaction);
		}
		else
			System.out.println("Sorry! Transaction not found.");
	}

	@Override
	public void remove(Transactions transactions) {
		// TODO Auto-generated method stub
		Transactions dbTransaction=findTransactionsById(transactions.getTransactionId());
		if(dbTransaction!=null) {
			dao.delete(dbTransaction);
		}
		else
			System.out.println("Sorry! Transaction not found.");
	}

	@Override
	public Transactions findTransactionsById(int transactionId) {
		// TODO Auto-generated method stub
		return dao.getByTransactionId(transactionId);
	}

	@Override
	public List<Transactions> findAllTransactions() {
		// TODO Auto-generated method stub
		return dao.getAllTransactions();
	}

}
