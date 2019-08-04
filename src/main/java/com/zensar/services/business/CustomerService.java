package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Customer;



public interface CustomerService {
	void create(Customer customer);
	void edit(Customer customer);
	void remove(Customer customer);
	Customer findCustomerById(int customerId);
	List<Customer> findAllCustomers();
}
