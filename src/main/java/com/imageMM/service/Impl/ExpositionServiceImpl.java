package com.imageMM.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Exposition;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.ExpositionRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.ExpositionService;
import com.imageMM.service.OeuvreService;

public class ExpositionServiceImpl implements ExpositionService{

	
	@Autowired
	private ExpositionRepository repo;
	
	

	@Override
	public ResponseObject createExposition(Exposition b) {
		// TODO Auto-generated method stub
		try {
			Exposition ov=repo.save(b);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}	}

}
