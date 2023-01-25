package com.imageMM.service;

import com.imageMM.Models.Localisation_de_conservation;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;

public interface LocalisationService {

	public ResponseObject createLocalisation(Localisation_de_conservation l);

	ResponseObject deleteLocalisation(String idLocalisation);

	ResponseObject updateLocalisation(Localisation_de_conservation o);

	ResponseObject getLocalisationById(String idLocalisation);

	ResponseObject getAllLocalisation();
	
	ResponseObject getByIdOeuvre();

}
