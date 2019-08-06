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

import com.zensar.entities.Benificiary;
import com.zensar.services.business.BenificiaryService;


@RestController
@RequestMapping("/benificiary")
public class BenificiaryResource {
	
	@Autowired
	private BenificiaryService benificiaryService;
	
	@GetMapping
	public List<Benificiary> getAllBenificiary(){
		
		return benificiaryService.findAllBenificiaries();
	}
	
	@GetMapping("/{id}")
	public Benificiary getBenificiary(@PathVariable("id")int benificiaryId) {
		
		return benificiaryService.findBenificiaryById(benificiaryId);
	}
	
	@PostMapping
	public String createBenificiary(
			@RequestParam("benificiaryId")int benificiaryId, 
			@RequestParam("accountNumber")int accountNumber,
			@RequestParam("benificiaryIfsc")String benificiaryIfsc,
			@RequestParam("nickname")String nickname) {
		Benificiary benificiary = new Benificiary(benificiaryId, accountNumber, benificiaryIfsc, nickname);
		benificiaryService.create(benificiary);
		
		return "Benificiary: "+benificiaryId+", created successfully";
	}
	
	@PutMapping
	public String editBenificiary(@RequestBody Benificiary benificiary) {
		benificiaryService.edit(benificiary);
		
		return "Benificiary: "+benificiary.getBenificiaryId()+", edited successfully";
	}
	
	@DeleteMapping
	public String removeBenificiary(@RequestBody Benificiary benificiary) {
		benificiaryService.remove(benificiary);
		
		return "Benificiary: "+benificiary.getBenificiaryId()+", deleted successfully";
	}
	
	@GetMapping("/count")
	public int getBenificiaryCount() {
		return benificiaryService.findAllBenificiaries().size();
	}
}
