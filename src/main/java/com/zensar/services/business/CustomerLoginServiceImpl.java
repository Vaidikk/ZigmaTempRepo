package com.zensar.services.business;

import java.util.List;

import com.zensar.daos.CustomerLoginDao;
import com.zensar.entities.CustomerLogin;

public class CustomerLoginServiceImpl implements CustomerLoginService {
	private CustomerLoginDao dao;
	@Override
	public void create(CustomerLogin customerLogin) {
		// TODO Auto-generated method stub
		dao.insert(customerLogin);
	}

	@Override
	public void edit(CustomerLogin customerLogin) {
		// TODO Auto-generated method stub
		CustomerLogin dbcustomerLogin=findCustomerLoginById(customerLogin.getCrn());
		if(dbcustomerLogin!=null) {
			dbcustomerLogin.setPassword(customerLogin.getPassword());
		}
		else
			System.out.println("Sorry! Customer login Details not found.");
	}

	@Override
	public void remove(CustomerLogin customerLogin) {
		// TODO Auto-generated method stub
		dao.delete(customerLogin);
	}

	@Override
	public CustomerLogin findCustomerLoginById(int crn) {
		// TODO Auto-generated method stub
		return dao.getByCRN(crn);
	}

	@Override
	public List<CustomerLogin> findAllCustomerLogins() {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

}
