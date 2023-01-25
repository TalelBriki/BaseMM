package com.imageMM.service;

import com.imageMM.Models.Localisation_de_conservation;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Models.Signature;
import com.imageMM.Response.ResponseObject;

public interface SignatureService {

	public ResponseObject createSignature(Signature s);

	ResponseObject deleteSignature(String idSignature);

	ResponseObject updateSignature(Signature o);

	ResponseObject getSignatureById(String idSignature);

	ResponseObject getAllSignature();
}
