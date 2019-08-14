package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	HibernateTemplate ht;
	@Override
	public void insert(Customer customer) {
		// TODO Auto-generated method stub
		ht.save(customer);
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		ht.update(customer);
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		ht.delete(customer);
		
	}

	@Override
	public Customer getByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return ht.get(Customer.class, customerId);
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return ht.loadAll(Customer.class);
	}

}
