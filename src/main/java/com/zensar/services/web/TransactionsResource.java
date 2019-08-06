package com.zensar.services.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Transactions;
import com.zensar.services.business.TransactionsService;


@RestController
@RequestMapping("/transactions")
public class TransactionsResource {
	
	@Autowired
	private TransactionsService transactionService;
	
	@GetMapping
	public List<Transactions> getAllTransactions(){
		
		return transactionService.findAllTransactions();
	}
	
	@GetMapping("/{id}")
	public Transactions getTransaction(@PathVariable("id")int transactionId) {
		
		return transactionService.findTransactionsById(transactionId);
	}
	
	@PostMapping
	public String createTransaction(
			@RequestParam("transactionId")int transactionId, 
			@RequestParam("accountNumber")int accountNumber,
			@RequestParam("transactionType")String transactionType,
			@RequestParam("transactionMode")String transactionMode,
			@RequestParam("transactionTime")String transactionTime,
			@RequestParam("transactionAmount")int transactionAmount,
			@RequestParam("recieverAccountNumber")int recieverAccountNumber) {
		Transactions transactions = new Transactions(transactionId, accountNumber, transactionType, transactionMode, transactionTime, transactionAmount, recieverAccountNumber);
		transactionService.create(transactions);
		
		return "Transaction: "+transactionId+", created successfully";
	}
	
	@PutMapping
	public String editAccount(@RequestBody Transactions transactions) {
		transactionService.edit(transactions);
		
		return "Transaction: "+transactions.getTransactionId()+", edited successfully";
	}
	
	@DeleteMapping
	public String removeAccount(@RequestBody Transactions transactions) {
		transactionService.remove(transactions);
		
		return "Transaction: "+transactions.getTransactionId()+", deleted successfully";
	}
	
	@GetMapping("/count")
	public int getTransactionsCount() {
		return transactionService.findAllTransactions().size();
	}
}
