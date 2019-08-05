package com.zensar.services.business;

import java.util.List;

import com.zensar.daos.CustomerDao;
import com.zensar.entities.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao dao;
	@Override
	public void create(Customer customer) {
		// TODO Auto-generated method stub
		dao.insert(customer);
	}

	@Override
	public void edit(Customer customer) {
		// TODO Auto-generated method stub
		Customer dbCustomer=findCustomerById(customer.getCustomerId());
		if(dbCustomer!=null) {
			dbCustomer.setCustomerName(customer.getCustomerName());
			dbCustomer.setMobileNumber(customer.getMobileNumber());
			dbCustomer.setEmail(customer.getEmail());
			dbCustomer.setAddress(customer.getAddress());
			dbCustomer.setAadhar(customer.getAadhar());
			dao.update(dbCustomer);		
		}
		else
			System.out.println("Sorry! Customer not found.");
	}

	@Override
	public void remove(Customer customer) {
		// TODO Auto-generated method stub
		Customer dbCustomer=findCustomerById(customer.getCustomerId());
		if(dbCustomer!=null) {
			dao.delete(dbCustomer);
		}
		else
			System.out.println("Sorry! Customer not found.");
	}

	@Override
	public Customer findCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return dao.getByCustomerId(customerId);
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
