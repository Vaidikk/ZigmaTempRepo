package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Transactions;



public interface TransactionsService {
	void create(Transactions transactions);
	void edit(Transactions transactions);
	void remove(Transactions transactions);
	Transactions findTransactionsById(int transactionId);
	List<Transactions> findAllTransactions();
}
