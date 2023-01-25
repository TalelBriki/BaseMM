package com.imageMM.EndPoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imageMM.Models.Acquisition;
import com.imageMM.service.AcquisitionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class AquisitionEndPoint {
     @Autowired
     AcquisitionService AcquisitionService;
	
	
	
	 @ApiOperation(value = "create new Acquisition", notes = "return  the new Acquisition created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createAcquisition", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createAcquisition(
			@ApiParam
			@RequestBody
			Acquisition Acquisition)
	{
	return AcquisitionService.createAcquisition(Acquisition);
	}
	

	
	
	 @ApiOperation(value = "delete given Acquisition", notes = "delete  a given Acquisition.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteAcquisition/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteAcquisition(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return AcquisitionService.deleteAcquisition(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Acquisition by id", notes = "get Acquisition by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAcquisitionById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAcquisitionById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return AcquisitionService.getAcquisitionById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Acquisition list", notes = "get Acquisition by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllAcquisition", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllAcquisition() {
		return AcquisitionService.getAllAcquisition();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Acquisition ", notes = "update Acquisition\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Acquisition does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateAcquisition", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateAcquisition(
			 @ApiParam
			 @RequestBody
			 Acquisition o
			 ) {
		return AcquisitionService.updateAcquisition(o);
		 
	 }


}
