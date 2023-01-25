package com.imageMM.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.OeuvreService;



@Service
public class OeuvreServiceImpl implements OeuvreService{

	
	@Autowired
	private OeuvreRepository repo;
	
	@Override
	public ResponseObject createOeuvreObject(Oeuvre o) {
		// TODO Auto-generated method stub
		try {
			Oeuvre ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	@Override
	public ResponseObject deleteOeuvreObject(String idOeuvre) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(idOeuvre);
			return new ResponseObject(EnumMessage.SUCCESS_DELETE.code,
					EnumMessage.SUCCESS_DELETE.label, null); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	@Override
	public ResponseObject updateOeuvreObject(Oeuvre o) {
		// TODO Auto-generated method stub
		try {
			Oeuvre ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	@Override
	public ResponseObject getOeuvreObjectById(String idOeuvre) {
		try {
			Oeuvre ov=repo.getById(idOeuvre);
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
	public ResponseObject getAllOeuvreObject() {
		try {
			List<Oeuvre> ov=repo.findAll();
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
	public ResponseObject findOeuvreByCritere(String cirtere, String cirtereValue) {
		try {
			// TODO Auto-generated method stub
			List<Oeuvre> list=new ArrayList<>();
			System.out.println(cirtere);
			switch (cirtere.toUpperCase()) {
			case "ARTISTE":
				list=repo.getByIdArtiste(cirtereValue);
				break;
			case "CATEGORIE":
				list=repo.getByCategorie(cirtereValue);
	        break;
	        
			case "POIDS_MAX":
				list=repo.getByCategorie(cirtereValue);
	        break;

			default:
				list=null;
				break;
			}
			if(list==null||list.isEmpty())
			{
				return new ResponseObject(EnumMessage.LIST_EMPTY.code,
						EnumMessage.LIST_EMPTY.label, null); 	
			}
			return new ResponseObject(EnumMessage.LIST_NOT_EMPTY.code,
					EnumMessage.LIST_NOT_EMPTY.label, list); 	
			}	
		
	catch (Exception e) {
		return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
	}
	}

	@Override
	public ResponseObject advancedFilterOeuvre() {
		// TODO Auto-generated method stub
		return null;
	}

}
