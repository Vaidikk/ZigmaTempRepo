package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.CustomerLogin;



public interface CustomerLoginService {
	void create(CustomerLogin customerLogin);
	void edit(CustomerLogin customerLogin);
	void remove(CustomerLogin customerLogin);
	CustomerLogin findCustomerLoginById(int crn);
	List<CustomerLogin> findAllCustomerLogins();
}
