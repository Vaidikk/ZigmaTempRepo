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

import com.zensar.entities.CustomerLogin;
import com.zensar.services.business.CustomerLoginService;


@RestController
@RequestMapping("/customerLogin")
public class CustomerLoginResource {
	
	@Autowired
	private CustomerLoginService customerLoginService;
	
	@GetMapping
	public List<CustomerLogin> getAllCustomerLogins(){
		
		return customerLoginService.findAllCustomerLogins();
	}
	
	@GetMapping("/{id}")
	public CustomerLogin getCustomerLogin(@PathVariable("id")int crn) {
		
		return customerLoginService.findCustomerLoginById(crn);
	}
	
	@PostMapping
	public String createCustomerLogin(
			@RequestParam("crn")int crn, 
			@RequestParam("password")String password) {
		CustomerLogin customerLogin = new CustomerLogin(crn, password);
		customerLoginService.create(customerLogin);
		
		return "CustomerLogin: "+crn+", created successfully";
	}
	
	@PutMapping
	public String editCustomerLogin(@RequestBody CustomerLogin customerLogin) {
		customerLoginService.edit(customerLogin);
		
		return "CustomerLogin: "+customerLogin.getCrn()+", edited successfully";
	}
	
	@DeleteMapping
	public String removeCustomerLogin(@RequestBody CustomerLogin customerLogin) {
		customerLoginService.remove(customerLogin);
		
		return "CustomerLogin: "+customerLogin.getCrn()+", deleted successfully";
	}
	
	@GetMapping("/count")
	public int getCustomerLoginCount() {
		return customerLoginService.findAllCustomerLogins().size();
	}
}
