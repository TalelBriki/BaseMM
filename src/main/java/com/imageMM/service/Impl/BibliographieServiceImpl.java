package com.imageMM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Bibliographie;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.BibliographieRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.BibliographieService;
import com.imageMM.service.OeuvreService;

public class BibliographieServiceImpl implements BibliographieService{

	
	@Autowired
	private BibliographieRepository repo;
	
	

	@Override
	public ResponseObject createBibliographie(Bibliographie b) {
		// TODO Auto-generated method stub
		try {
			Bibliographie ov=repo.save(b);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}	}


		
@Override
	public ResponseObject deleteBibliographie(String idBibliographie) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(idBibliographie);
			return new ResponseObject(EnumMessage.SUCCESS_DELETE.code,
					EnumMessage.SUCCESS_DELETE.label, null); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	
	@Override
	public ResponseObject updateBibliographie(Bibliographie o) {
		// TODO Auto-generated method stub
		try {
			Bibliographie ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
	
	public ResponseObject getBibliographieById(String idBibliographie) {
		try {
			Bibliographie ov=repo.getById(idBibliographie);
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
	
	public ResponseObject getAllBibliographie() {
		try {
			List<Bibliographie> ov=repo.findAll();
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
