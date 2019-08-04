package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Customer;

public interface CustomerDao {
	//actions for Customer
		void insert(Customer customer);
		void update(Customer customer);
		void delete(Customer customer);
		Customer getByCustomerId(int customerId);
		List <Customer> getAll();
}
