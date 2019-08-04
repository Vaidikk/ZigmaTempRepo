package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.zensar.entities.Benificiary;

public class BenificiaryDaoImpl implements BenificiaryDao {
	@Autowired
	HibernateTemplate ht;
	@Override
	public void insert(Benificiary benificiary) {
		// TODO Auto-generated method stub
		ht.save(benificiary);
	}

	@Override
	public void update(Benificiary benificiary) {
		// TODO Auto-generated method stub
		ht.update(benificiary);
	}

	@Override
	public void delete(Benificiary benificiary) {
		// TODO Auto-generated method stub
		ht.delete(benificiary);
	}

	@Override
	public Benificiary getByBenificiaryId(int benificiaryId) {
		// TODO Auto-generated method stub
		return ht.get(Benificiary.class, benificiaryId);
	}

	@Override
	public List<Benificiary> getAllBenificiaries() {
		// TODO Auto-generated method stub
		return ht.loadAll(Benificiary.class);
	}

}
