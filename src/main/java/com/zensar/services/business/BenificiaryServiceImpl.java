package com.zensar.services.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.BenificiaryDao;
import com.zensar.entities.Benificiary;

@Service
@Transactional
public class BenificiaryServiceImpl implements BenificiaryService {
	private BenificiaryDao dao;
	@Override
	public void create(Benificiary benificiary) {
		// TODO Auto-generated method stub
		dao.insert(benificiary);
	}

	@Override
	public void edit(Benificiary benificiary) {
		// TODO Auto-generated method stub
		Benificiary dbbenificiary=findBenificiaryById(benificiary.getBenificiaryId());
		
		if(dbbenificiary!=null){
				dbbenificiary.setBenificiaryIfsc(benificiary.getBenificiaryIfsc());
				dbbenificiary.setNickname(benificiary.getNickname());
		}
		else
			System.out.println("Sorry! Benificiary does not exist.");  
	}

	@Override
	public void remove(Benificiary benificiary) {
		// TODO Auto-generated method stub
		Benificiary dbbenificiary=findBenificiaryById(benificiary.getBenificiaryId());
		if(dbbenificiary!=null) {
			dao.delete(dbbenificiary);
		}
		else
			System.out.println("Sorry! Benificiary does not exist.");
	}

	@Override
	public Benificiary findBenificiaryById(int benificiaryId) {
		// TODO Auto-generated method stub
		return dao.getByBenificiaryId(benificiaryId);
	}

	@Override
	public List<Benificiary> findAllBenificiaries() {
		// TODO Auto-generated method stub
		return dao.getAllBenificiaries();
	}

}
