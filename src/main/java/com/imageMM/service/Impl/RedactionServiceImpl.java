package com.imageMM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Redaction_notice_inventaire;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.RedactionRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.RedactionService;
import com.imageMM.service.OeuvreService;


public class RedactionServiceImpl implements RedactionService{

	
	@Autowired
	private RedactionRepository repo;
	
	

	@Override
	public ResponseObject createRedaction(Redaction_notice_inventaire b) {
		// TODO Auto-generated method stub
		try {
			Redaction_notice_inventaire ov=repo.save(b);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}	}




@Override
	public ResponseObject deleteRedaction(String idRedaction) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(idRedaction);
			return new ResponseObject(EnumMessage.SUCCESS_DELETE.code,
					EnumMessage.SUCCESS_DELETE.label, null); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	
	@Override
	public ResponseObject updateRedaction(Redaction_notice_inventaire o) {
		// TODO Auto-generated method stub
		try {
			Redaction_notice_inventaire ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
	
	public ResponseObject getRedactionById(String idRedaction) {
		try {
			Redaction_notice_inventaire ov=repo.getById(idRedaction);
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
	
	public ResponseObject getAllRedaction() {
		try {
			List<Redaction_notice_inventaire> ov=repo.findAll();
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
