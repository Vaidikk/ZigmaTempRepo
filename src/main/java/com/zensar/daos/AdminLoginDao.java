package com.zensar.daos;

import java.util.List;

import com.zensar.entities.AdminLogin;

public interface AdminLoginDao {
	//adminLogin actions
		void insert(AdminLogin  adminlogin);
		void update(AdminLogin adminlogin);
		void delete(AdminLogin adminlogin);
		AdminLogin getByAdminId(int adminId);
		List <AdminLogin> getAllAdmins();
}
