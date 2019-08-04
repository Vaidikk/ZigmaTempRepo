package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Account;
import com.zensar.entities.AdminLogin;

public interface AdminLoginService {
	void create(AdminLogin adminLogin);
	void edit(AdminLogin adminLogin);
	void remove(AdminLogin adminLogin);
	AdminLogin findAdminLoginById(int adminId);
	List<AdminLogin> findAllAdminLogins();
}
