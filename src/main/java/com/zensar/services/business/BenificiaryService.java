package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Benificiary;



public interface BenificiaryService {
	void create(Benificiary benificiary);
	void edit(Benificiary benificiary);
	void remove(Benificiary benificiary);
	Benificiary findBenificiaryById(int benificiaryId);
	List<Benificiary> findAllBenificiaries();
}
