package com.zensar.services.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.daos.AdminLoginDao;

import com.zensar.entities.AdminLogin;

@Service
@Transactional
public class AdminLoginServiceImpl implements AdminLoginService {
	
	@Autowired
	private AdminLoginDao dao;
	
	@Override
	public void create(AdminLogin adminLogin) {
		// TODO Auto-generated method stub
		System.out.println("$$$Inside Service: " + adminLogin);
		dao.insert(adminLogin);
	}

	@Override
	public void edit(AdminLogin adminLogin) {
		// TODO Auto-generated method stub
		AdminLogin dbadminlogin=findAdminLoginById(adminLogin.getAdminId());
		if(dbadminlogin!=null){
		dbadminlogin.setPassword(adminLogin.getPassword());
		dao.update(dbadminlogin);
		}
		else
			System.out.println("Sorry! Admin does not exist.");
	}

	@Override
	public void remove(AdminLogin adminLogin) {
		// TODO Auto-generated method stub
		dao.delete(adminLogin);
	}

	@Override
	public AdminLogin findAdminLoginById(int adminId) {
		// TODO Auto-generated method stub
		return dao.getByAdminId(adminId);
	}

	@Override
	public List<AdminLogin> findAllAdminLogins() {
		// TODO Auto-generated method stub
		return dao.getAllAdmins();
	}

}
