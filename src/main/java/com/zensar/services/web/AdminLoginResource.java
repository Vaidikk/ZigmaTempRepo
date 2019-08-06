package com.zensar.services.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.AdminLogin;
import com.zensar.services.business.AdminLoginService;

@RestController
@RequestMapping("/adminLogin")
public class AdminLoginResource {
	
	@Autowired
	private AdminLoginService adminLoginService;
	
	@GetMapping
	public List<AdminLogin> getAllAdminLogins(){
		
		return adminLoginService.findAllAdminLogins();
	}
	
	@GetMapping("/{id}")
	public AdminLogin getAdminLogin(@PathVariable("id")int adminId) {
		
		return adminLoginService.findAdminLoginById(adminId);
	}
	
	@PostMapping
	public String createAdminLogin(
			@RequestParam("adminId")int adminId, 
			@RequestParam("password")String password) {
		AdminLogin adminLogin = new AdminLogin(adminId, password);
		adminLoginService.create(adminLogin);
		
		return "AdminLogin: "+adminId+", created successfully";
	}
	
	@PutMapping
	public String editAdminLogin(@RequestBody AdminLogin adminLogin) {
		adminLoginService.edit(adminLogin);
		
		return "AdminLogin: "+adminLogin.getAdminId()+", edited successfully";
	}
	
	@DeleteMapping
	public String removeAdminLogin(@RequestBody AdminLogin adminLogin) {
		adminLoginService.remove(adminLogin);
		
		return "AdminLogin: "+adminLogin.getAdminId()+", deleted successfully";
	}
	
	@GetMapping("/count")
	public int getAdminLoginCount() {
		return adminLoginService.findAllAdminLogins().size();
	}
}
