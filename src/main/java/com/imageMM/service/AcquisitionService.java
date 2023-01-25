package com.imageMM.service;

import com.imageMM.Models.Acquisition;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;

public interface AcquisitionService {

	public ResponseObject createAcquisition(Acquisition a);

	ResponseObject deleteAcquisition(String idAcquisition);

	ResponseObject updateAcquisition(Acquisition o);

	ResponseObject getAcquisitionById(String idAcquisition);

	ResponseObject getAllAcquisition();
}
