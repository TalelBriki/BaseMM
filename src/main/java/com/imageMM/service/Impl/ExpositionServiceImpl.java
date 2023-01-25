package com.imageMM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Exposition;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.ExpositionRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.ExpositionService;
import com.imageMM.service.OeuvreService;



@Service
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



@Override
	public ResponseObject deleteExposition(String idExposition) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(idExposition);
			return new ResponseObject(EnumMessage.SUCCESS_DELETE.code,
					EnumMessage.SUCCESS_DELETE.label, null); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	
	@Override
	public ResponseObject updateExposition(Exposition o) {
		// TODO Auto-generated method stub
		try {
			Exposition ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
	
	public ResponseObject getExpositionById(String idExposition) {
		try {
			Exposition ov=repo.getById(idExposition);
			if(ov==null)
			{
				return new ResponseObject(EnumMessage.OBJECT_NOT_EXISTS.code,
						EnumMessage.OBJECT_NOT_EXISTS.label, null); 
			}
			return new ResponseObject(EnumMessage.OBJECT_EXISTS.code,
					EnumMessage.OBJECT_EXISTS.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
	
	public ResponseObject getAllExposition() {
		try {
			List<Exposition> ov=repo.findAll();
			if(ov==null||ov.isEmpty())
			{
				return new ResponseObject(EnumMessage.LIST_EMPTY.code,
						EnumMessage.LIST_EMPTY.label, null); 
			}
			return new ResponseObject(EnumMessage.LIST_NOT_EMPTY.code,
					EnumMessage.LIST_NOT_EMPTY.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

}
