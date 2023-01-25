package com.imageMM.service;

import com.imageMM.Models.Acquisition;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;

public interface AcquisitionService {

	public ResponseObject createAcquisition(Acquisition a);
}
