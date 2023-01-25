package com.imageMM.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.OeuvreService;

public class OeuvreServiceImpl implements OeuvreService{

	
	@Autowired
	private OeuvreRepository repo;
	
	@Override
	public ResponseObject createOeuvreObject(Oeuvre o) {
		// TODO Auto-generated method stub
		try {
			Oeuvre ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

}
