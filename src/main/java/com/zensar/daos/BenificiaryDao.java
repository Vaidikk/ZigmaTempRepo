package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Benificiary;

public interface BenificiaryDao {
	//actions for Benificiary
		void insert(Benificiary benificiary);
		void update(Benificiary benificiary);
		void delete(Benificiary benificiary);
		Benificiary getByBenificiaryId(int benificiaryId);
		List <Benificiary> getAllBenificiaries();
}
