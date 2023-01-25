package com.imageMM.service;

import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;

public interface OeuvreService {

	//crud operations
	public ResponseObject createOeuvreObject(Oeuvre o);
	public ResponseObject deleteOeuvreObject(String idOeuvre);
	public ResponseObject updateOeuvreObject(Oeuvre o);
	public ResponseObject getOeuvreObjectById(String idOeuvre);
	public ResponseObject getAllOeuvreObject();
	
	public ResponseObject findOeuvreByCritere(String cirtere,String cirtereValue);
	
}
