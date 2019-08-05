package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Branch;

public interface BranchDao {
	//actions for Branch
		void insert(Branch branch);
		void update(Branch branch);
		void delete(Branch branch);
		Branch getByIFSC(String ifsc);
		List <Branch> getAllBranches();
}
