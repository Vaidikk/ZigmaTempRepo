package com.zensar.services.business;

import java.util.List;

import com.zensar.daos.AdminLoginDao;

import com.zensar.entities.AdminLogin;

public class AdminLoginServiceImpl implements AdminLoginService {
	private AdminLoginDao dao;
	@Override
	public void create(AdminLogin adminLogin) {
		// TODO Auto-generated method stub
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
