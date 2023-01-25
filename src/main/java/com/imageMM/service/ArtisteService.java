package com.imageMM.service;

import com.imageMM.Models.Artiste;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;

public interface ArtisteService {

	public ResponseObject createArtiste(Artiste a);

	ResponseObject deleteArtiste(String idArtiste);

	ResponseObject updateArtiste(Artiste o);

	ResponseObject getArtisteById(String idArtiste);

	ResponseObject getAllArtiste();
}
