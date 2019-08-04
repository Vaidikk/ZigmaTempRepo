package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Transactions;

public interface TransactionsDao {
	//actions for Transactions
		void insert(Transactions transactions);
		void update(Transactions transactions);
		void delete(Transactions transactions);
		Transactions getByTransactionId(int transactionId);
		List <Transactions> getAllTransactions();
}
