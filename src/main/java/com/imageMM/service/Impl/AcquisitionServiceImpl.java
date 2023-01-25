package com.imageMM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Acquisition;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.AcquisitionRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.AcquisitionService;
import com.imageMM.service.OeuvreService;




@Service
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



@Override
	public ResponseObject deleteAcquisition(String idAcquisition) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(idAcquisition);
			return new ResponseObject(EnumMessage.SUCCESS_DELETE.code,
					EnumMessage.SUCCESS_DELETE.label, null); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	
	@Override
	public ResponseObject updateAcquisition(Acquisition o) {
		// TODO Auto-generated method stub
		try {
			Acquisition ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
	
	public ResponseObject getAcquisitionById(String idAcquisition) {
		try {
			Acquisition ov=repo.getById(idAcquisition);
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
	
	public ResponseObject getAllAcquisition() {
		try {
			List<Acquisition> ov=repo.findAll();
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
