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

import com.zensar.entities.Branch;
import com.zensar.services.business.BranchService;


@RestController
@RequestMapping("/branches")
public class BranchResource {
	
	@Autowired
	private BranchService branchService;
	
	@GetMapping
	public List<Branch> getAllBranches(){
		
		return branchService.findAllBranches();
	}
	
	@GetMapping("/{id}")
	public Branch getBranch(@PathVariable("id")String ifsc) {
		
		return branchService.findBranchById(ifsc);
	}
	
	@PostMapping
	public String createBranch(
			@RequestParam("ifsc")String ifsc, 
			@RequestParam("adminId")int adminId,
			@RequestParam("branchName")String branchName,
			@RequestParam("branchAddress")String branchAddress) {
		Branch branch = new Branch(ifsc, adminId, branchName, branchAddress);
		branchService.create(branch);
		
		return "Branch: "+ifsc+", created successfully";
	}
	
	@PutMapping
	public String editBranch(@RequestBody Branch branch) {
		branchService.edit(branch);
		
		return "Branch: "+branch.getIfsc()+", edited successfully";
	}
	
	@DeleteMapping
	public String removeBranch(@RequestBody Branch branch) {
		branchService.remove(branch);
		
		return "Branch: "+branch.getIfsc()+", deleted successfully";
	}
	
	@GetMapping("/count")
	public int getBranchCount() {
		return branchService.findAllBranches().size();
	}
}
