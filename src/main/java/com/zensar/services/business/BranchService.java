package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Branch;



public interface BranchService {
	void create(Branch branch);
	void edit(Branch branch);
	void remove(Branch branch);
	Branch findBranchById(int ifsc);
	List<Branch> findAllBranches();
}
