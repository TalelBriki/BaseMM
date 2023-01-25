package com.imageMM.service;

import com.imageMM.Models.Pret;
import com.imageMM.Response.ResponseObject;

public interface PretService {

	public ResponseObject createPret(Pret p);

	public ResponseObject deletePret(String idPret);
	public ResponseObject updatePret(Pret o);
	public ResponseObject getPretById(String idPret);
	public ResponseObject getAllPret();
	
	
	ResponseObject getByIdExposition();

}
