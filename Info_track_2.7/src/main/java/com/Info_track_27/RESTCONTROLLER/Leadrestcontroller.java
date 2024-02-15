package com.Info_track_27.RESTCONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Info_track_27.ENTITY.Lead;
import com.Info_track_27.REPOSATROY.leadrepo;

@RestController
@RequestMapping("/api")

public class Leadrestcontroller {
	@Autowired
	 public leadrepo leadrepo;
	 @GetMapping
	  public List<Lead> getapi(Lead lead){
		 List<Lead> leads = leadrepo.findAll();
		 return leads;
		 
		  }
	 @PostMapping
	  public void saveapi( @RequestBody  Lead lead) {
		 leadrepo.save(lead);
		 
	 }
	  @PutMapping
	   public void updateapi(@RequestBody Lead lead) {
		  leadrepo.save(lead);
		  
	  }
	 @DeleteMapping("/{id}")
		 public void deletebyid(@PathVariable("id") Long id) {
		 leadrepo.deleteById(id);
	 }
	 
	 
	 
	 
	 

}
