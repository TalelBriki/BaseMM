package com.imageMM.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Artiste;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.ArtisteRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.ArtisteService;
import com.imageMM.service.OeuvreService;

public class ArtisteServiceImpl implements ArtisteService{

	
	@Autowired
	private ArtisteRepository repo;
	
	

	@Override
	public ResponseObject createArtiste(Artiste a) {
		try {
			Artiste ar=repo.save(a);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ar); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

}
