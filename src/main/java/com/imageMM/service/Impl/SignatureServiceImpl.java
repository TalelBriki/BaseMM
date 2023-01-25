package com.imageMM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Models.Signature;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.repository.SignatureRepository;
import com.imageMM.service.OeuvreService;
import com.imageMM.service.SignatureService;



@Service
public class SignatureServiceImpl implements SignatureService{

	
	@Autowired
	private SignatureRepository repo;
	


	@Override
	public ResponseObject createSignature(Signature s) {
		// TODO Auto-generated method stub
		try {
			Signature sign=repo.save(s);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, s); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}	}

@Override
	public ResponseObject deleteSignature(String idSignature) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(idSignature);
			return new ResponseObject(EnumMessage.SUCCESS_DELETE.code,
					EnumMessage.SUCCESS_DELETE.label, null); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
	
	public ResponseObject updateSignature(Signature o) {
		// TODO Auto-generated method stub
		try {
			Signature ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	@Override
	
	
	public ResponseObject getSignatureById(String idSignature) {
		try {
			Signature ov=repo.getById(idSignature);
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
	
	
	public ResponseObject getAllSignature() {
		try {
			List<Signature> ov=repo.findAll();
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
