package com.Info_track_27.CONTROLLER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Info_track_27.ENTITY.Lead;
import com.Info_track_27.ENTITY.contact;
import com.Info_track_27.REPOSATROY.contactrepo;
import com.Info_track_27.SERVICES.Leadserv;
import com.Info_track_27.SERVICES.contactser;
import com.Info_track_27.UTILL.ifnomailsen;

import ch.qos.logback.core.model.Model;

@Controller

public class controller {
  @Autowired
     public Leadserv leadser;
   @Autowired
    public contactser contacser;
   @Autowired
    public ifnomailsen  mailsend;
  
  
  
   @RequestMapping("/webpage")
    public String show() {
	   return "Leadjsp";
   }
   
   @RequestMapping("/leadss")
    public String savadata(Lead lead,ModelMap model) {
	   
	 
	   mailsend.sendmail(lead.getEmailId(), " WELCOME TO BMW ", " all the best");
	   model.addAttribute("lead",lead);
	  
	   leadser.saveleaddata(lead);
	   
	    return "contact";   
   }
    @RequestMapping ("/contact")
     public String contactdata( contact contact,@RequestParam("id") Long id) {
    	 leadser.deleteoneid(id);
    	contacser.contactdata(contact);
    	 return "Leadjsp";
    	
    	
    	
    	
    }
    
   
}
