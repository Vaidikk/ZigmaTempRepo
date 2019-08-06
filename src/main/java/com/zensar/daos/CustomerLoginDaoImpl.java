package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.CustomerLogin;

@Repository
public class CustomerLoginDaoImpl implements CustomerLoginDao {
	@Autowired
	HibernateTemplate ht;
	@Override
	public void insert(CustomerLogin customerlogin) {
		// TODO Auto-generated method stub
		ht.save(customerlogin);
	}

	@Override
	public void update(CustomerLogin customerlogin) {
		// TODO Auto-generated method stub
		ht.update(customerlogin);
	}

	@Override
	public void delete(CustomerLogin customerlogin) {
		// TODO Auto-generated method stub
		ht.delete(customerlogin);
	}

	@Override
	public CustomerLogin getByCRN(int crn) {
		// TODO Auto-generated method stub
		return ht.get(CustomerLogin.class, crn);
	}

	@Override
	public List<CustomerLogin> getAllCustomers() {
		// TODO Auto-generated method stub
		return ht.loadAll(CustomerLogin.class);
	}

}
