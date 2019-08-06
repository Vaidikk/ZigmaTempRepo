package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Branch;

@Repository
public class BranchDaoImpl implements BranchDao {
	@Autowired
	HibernateTemplate ht;
	@Override
	public void insert(Branch branch) {
		// TODO Auto-generated method stub
		ht.save(branch);
	}

	@Override
	public void update(Branch branch) {
		// TODO Auto-generated method stub
		ht.update(branch);
	}

	@Override
	public void delete(Branch branch) {
		// TODO Auto-generated method stub
		ht.delete(branch);
	}

	@Override
	public Branch getByIFSC(String ifsc) {
		// TODO Auto-generated method stub
		return ht.get(Branch.class, ifsc);
	}

	@Override
	public List<Branch> getAllBranches() {
		// TODO Auto-generated method stub
		return ht.loadAll(Branch.class);
	}

}
