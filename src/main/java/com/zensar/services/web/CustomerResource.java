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

import com.zensar.entities.Customer;
import com.zensar.services.business.CustomerService;


@RestController
@RequestMapping("/customers")
public class CustomerResource {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		
		return customerService.findAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable("id")int customerId) {
		
		return customerService.findCustomerById(customerId);
	}
	
	@PostMapping
	public String createCustomer(
			@RequestParam("customerId")int customerId, 
			@RequestParam("crn")int crn,
			@RequestParam("accountNumber")int accountNumber,
			@RequestParam("customerName")String customerName,
			@RequestParam("mobileNumber")int mobileNumber,
			@RequestParam("email")String email,
			@RequestParam("address")String address,
			@RequestParam("aadhar")int aadhar) {
		Customer customer = new Customer(customerId, crn, accountNumber, customerName, mobileNumber, email, address, aadhar);
		customerService.create(customer);
		
		return "Customer: "+customerId+", created successfully";
	}
	
	@PutMapping
	public String editCustomer(@RequestBody Customer customer) {
		customerService.edit(customer);
		
		return "Customer: "+customer.getCustomerId()+", edited successfully";
	}
	
	@DeleteMapping
	public String removeCustomer(@RequestBody Customer customer) {
		customerService.remove(customer);
		
		return "Customer: "+customer.getCustomerId()+", deleted successfully";
	}
	
	@GetMapping("/count")
	public int getCustomerCount() {
		return customerService.findAllCustomers().size();
	}
}
