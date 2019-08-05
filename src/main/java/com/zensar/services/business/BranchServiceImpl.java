package com.zensar.services.business;

import java.util.List;

import com.zensar.daos.BranchDao;

import com.zensar.entities.Branch;

public class BranchServiceImpl implements BranchService {
	private BranchDao dao;
	@Override
	public void create(Branch branch) {
		// TODO Auto-generated method stub
		dao.insert(branch);
	}

	@Override
	public void edit(Branch branch) {
		// TODO Auto-generated method stub
		Branch dbBranch=findBranchById(branch.getIfsc());
		if(dbBranch!=null) {
			dbBranch.setAdminId(branch.getAdminId());
			dbBranch.setBranchName(branch.getBranchName());
			dbBranch.setBranchAddress(branch.getBranchAddress());
		}
		else
			System.out.println("Branch not found");
	}

	@Override
	public void remove(Branch branch) {
		// TODO Auto-generated method stub
		Branch dbBranch = findBranchById(branch.getIfsc());
		if(dbBranch!=null) {
			dao.delete(dbBranch);
		}
		else
			System.out.println("Sorry! Branch not found");
	}

	@Override
	public Branch findBranchById(String ifsc) {
		// TODO Auto-generated method stub
		return dao.getByIFSC(ifsc);
	}

	@Override
	public List<Branch> findAllBranches() {
		// TODO Auto-generated method stub
		return dao.getAllBranches();
	}

}
