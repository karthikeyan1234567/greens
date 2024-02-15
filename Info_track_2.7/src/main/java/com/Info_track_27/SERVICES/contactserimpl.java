package com.Info_track_27.SERVICES;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Info_track_27.ENTITY.contact;
import com.Info_track_27.REPOSATROY.contactrepo;
 @Service

public class contactserimpl implements contactser {
	 @Autowired
	    public contactrepo conrepo;

	@Override
	public void contactdata(contact contact) {
		conrepo.save(contact);
		

	}

}
