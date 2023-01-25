package com.imageMM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Restauration;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.RestaurationRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.RestaurationService;
import com.imageMM.service.OeuvreService;




@Service
public class RestaurationServiceImpl implements RestaurationService{

	
	@Autowired
	private RestaurationRepository repo;
	
	

	@Override
	public ResponseObject createRestauration(Restauration b) {
		// TODO Auto-generated method stub
		try {
			Restauration ov=repo.save(b);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}	}


@Override
	public ResponseObject deleteRestauration(String idRestauration) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(idRestauration);
			return new ResponseObject(EnumMessage.SUCCESS_DELETE.code,
					EnumMessage.SUCCESS_DELETE.label, null); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
	public ResponseObject updateRestauration(Restauration o) {
		// TODO Auto-generated method stub
		try {
			Restauration ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	@Override
	
	public ResponseObject getRestaurationById(String idRestauration) {
		try {
			Restauration ov=repo.getById(idRestauration);
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
	
	public ResponseObject getAllRestauration() {
		try {
			List<Restauration> ov=repo.findAll();
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


	@Override
	public ResponseObject getByIdOeuvre() {
		// TODO Auto-generated method stub
		return null;
	}


}
