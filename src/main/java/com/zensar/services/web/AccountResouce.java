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

import com.zensar.entities.Account;
import com.zensar.services.business.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountResouce {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public List<Account> getAllAccounts(){
		
		return accountService.findAllAccounts();
	}
	
	@GetMapping("/{id}")
	public Account getAccount(@PathVariable("id")int accountNumber) {
		
		return accountService.findAccountById(accountNumber);
	}
	
	@PostMapping
	public String createAccount(
			@RequestParam("accountNumber")int accountNumber, 
			@RequestParam("accountType")String accountType,
			@RequestParam("accountBalance")double accountBalance,
			@RequestParam("accountTitle")String accountTitle,
			@RequestParam("ifsc")String ifsc) {
		Account account = new Account(accountNumber, accountType, accountBalance, accountTitle, ifsc);
		accountService.create(account);
		
		return "Account: "+accountNumber+", created successfully";
	}
	
	@PutMapping
	public String editAccount(@RequestBody Account account) {
		accountService.edit(account);
		
		return "Account: "+account.getAccountNumber()+", edited successfully";
	}
	
	@DeleteMapping
	public String removeAccount(@RequestBody Account account) {
		accountService.remove(account);
		
		return "Account: "+account.getAccountNumber()+", deleted successfully";
	}
	
	@GetMapping("/count")
	public int getAccountCount() {
		return accountService.findAllAccounts().size();
	}
}
