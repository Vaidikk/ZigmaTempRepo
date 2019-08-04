package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.zensar.entities.AdminLogin;

public class AdminLoginDaoImpl implements AdminLoginDao {
	@Autowired
	HibernateTemplate ht;
	@Override
	public void insert(AdminLogin adminlogin) {
		// TODO Auto-generated method stub
		ht.save(adminlogin);
	}

	@Override
	public void update(AdminLogin adminlogin) {
		// TODO Auto-generated method stub
		ht.update(adminlogin);
	}

	@Override
	public void delete(AdminLogin adminlogin) {
		// TODO Auto-generated method stub
		ht.delete(adminlogin);
	}

	@Override
	public AdminLogin getByAdminId(int adminId) {
		// TODO Auto-generated method stub
		return ht.get(AdminLogin.class, adminId);
	}

	@Override
	public List<AdminLogin> getAllAdmins() {
		// TODO Auto-generated method stub
		return ht.loadAll(AdminLogin.class);
	}

}
