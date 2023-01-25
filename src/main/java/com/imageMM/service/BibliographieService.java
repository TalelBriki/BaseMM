package com.imageMM.service;

import com.imageMM.Models.Bibliographie;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;

public interface BibliographieService {

	public ResponseObject createBibliographie(Bibliographie b);

	ResponseObject deleteBibliographie(String idBibliographie);

	ResponseObject updateBibliographie(Bibliographie o);

	ResponseObject getBibliographieById(String idBibliographie);

	ResponseObject getAllBibliographie();
}
