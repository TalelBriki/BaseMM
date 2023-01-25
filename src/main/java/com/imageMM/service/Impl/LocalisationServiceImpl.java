package com.imageMM.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Localisation_de_conservation;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.LocalisationRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.LocalisationService;
import com.imageMM.service.OeuvreService;


public class LocalisationServiceImpl implements LocalisationService{

	
	@Autowired
	private LocalisationRepository repo;
	
	

	



	@Override
	public ResponseObject createLocalisation(Localisation_de_conservation l) {
		try {
			Localisation_de_conservation ov=repo.save(l);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

}
