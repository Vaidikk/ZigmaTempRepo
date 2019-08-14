package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Customer;
import com.zensar.entities.CustomerLogin;



public interface CustomerService {
	void create(Customer customer);
	void edit(Customer customer);
	void remove(Customer customer);
	Customer findCustomerById(int customerId);
	List<Customer> findAllCustomers();
	
	Customer findCustomerByLogin(CustomerLogin customerLogin);
	
}
