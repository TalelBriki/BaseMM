package com.imageMM.service;

import com.imageMM.Models.Exposition;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;

public interface ExpositionService {

	public ResponseObject createExposition(Exposition e);

	ResponseObject deleteExposition(String idExposition);

	ResponseObject updateExposition(Exposition o);

	ResponseObject getExpositionById(String idExposition);

	ResponseObject getAllExposition();
	ResponseObject getByIdOeuvre();

}
