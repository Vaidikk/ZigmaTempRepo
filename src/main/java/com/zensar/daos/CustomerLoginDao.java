package com.zensar.daos;

import java.util.List;

import com.zensar.entities.CustomerLogin;

public interface CustomerLoginDao {
	//customerLogin actions
		void insert(CustomerLogin customerlogin);
		void update(CustomerLogin customerlogin);
		void delete(CustomerLogin customerlogin);
		CustomerLogin getByCRN(int crn);
		List <CustomerLogin> getAllCustomers();
}
