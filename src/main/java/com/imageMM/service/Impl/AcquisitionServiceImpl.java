package com.imageMM.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Acquisition;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.AcquisitionRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.AcquisitionService;
import com.imageMM.service.OeuvreService;


public class AcquisitionServiceImpl implements AcquisitionService{

	
	@Autowired
	private AcquisitionRepository repo;
	
	

	@Override
	public ResponseObject createAcquisition(Acquisition b) {
		// TODO Auto-generated method stub
		try {
			Acquisition ov=repo.save(b);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}	}

}
