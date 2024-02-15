package com.Info_track_27.SERVICES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Info_track_27.ENTITY.Lead;
import com.Info_track_27.REPOSATROY.leadrepo;
@Service

public class Leadservimpl implements Leadserv {
	@Autowired 
	 public leadrepo leadr;

	@Override
	public void saveleaddata(Lead lead) {
		leadr.save(lead);
		
	}

	@Override
	public void deleteoneid(Long id) {
		leadr.deleteById(id);
		
	}

	
}
