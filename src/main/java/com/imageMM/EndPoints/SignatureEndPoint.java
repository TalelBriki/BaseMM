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

import com.imageMM.Models.Signature;
import com.imageMM.service.SignatureService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;


@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class SignatureEndPoint {
     @Autowired
     SignatureService SignatureService;
	
	
	
	 @ApiOperation(value = "create new Signature", notes = "return  the new Signature created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createSignature", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createSignature(
			@ApiParam
			@RequestBody
			Signature signature)
	{
	return SignatureService.createSignature(signature);
	}
	

	
	
	 @ApiOperation(value = "delete given Signature", notes = "delete  a given Signature.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteSignature/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteSignature(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return SignatureService.deleteSignature(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Signature by id", notes = "get Signature by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getSignatureById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getSignatureById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return SignatureService.getSignatureById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Signature list", notes = "get Signature by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllSignature", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllSignature() {
		return SignatureService.getAllSignature();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Signature ", notes = "update Signature\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Signature does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateSignature", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateSignature(
			 @ApiParam
			 @RequestBody
			 Signature o
			 ) {
		return SignatureService.updateSignature(o);
		 
	 }


}
