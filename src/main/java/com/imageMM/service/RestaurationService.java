package com.imageMM.service;

import com.imageMM.Models.Localisation_de_conservation;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Models.Restauration;
import com.imageMM.Response.ResponseObject;

public interface RestaurationService {

	public ResponseObject createRestauration(Restauration r);

	ResponseObject deleteRestauration(String idRestauration);

	ResponseObject updateRestauration(Restauration o);

	ResponseObject getRestaurationById(String idRestauration);

	ResponseObject getAllRestauration();
}
