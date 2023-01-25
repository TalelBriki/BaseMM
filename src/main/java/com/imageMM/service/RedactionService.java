package com.imageMM.service;

import com.imageMM.Models.Localisation_de_conservation;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Models.Redaction_notice_inventaire;
import com.imageMM.Response.ResponseObject;

public interface RedactionService {

	public ResponseObject createRedaction(Redaction_notice_inventaire r);

	ResponseObject deleteRedaction(String idRedaction);

	ResponseObject updateRedaction(Redaction_notice_inventaire o);

	ResponseObject getRedactionById(String idRedaction);

	ResponseObject getAllRedaction();
	
	ResponseObject getByIdOeuvre();

}
