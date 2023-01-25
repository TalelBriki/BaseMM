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

import com.imageMM.Models.Bibliographie;
import com.imageMM.service.BibliographieService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;


@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class BibliographieEndPoint {
     @Autowired
     BibliographieService BibliographieService;
	
	
	
	 @ApiOperation(value = "create new Bibliographie", notes = "return  the new Bibliographie created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createBibliographie", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createBibliographie(
			@ApiParam
			@RequestBody
			Bibliographie Bibliographie)
	{
	return BibliographieService.createBibliographie(Bibliographie);
	}
	

	
	
	 @ApiOperation(value = "delete given Bibliographie", notes = "delete  a given Bibliographie.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteBibliographie/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteBibliographie(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return BibliographieService.deleteBibliographie(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Bibliographie by id", notes = "get Bibliographie by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getBibliographieById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getBibliographieById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return BibliographieService.getBibliographieById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Bibliographie list", notes = "get Bibliographie by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllBibliographie", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllBibliographie() {
		return BibliographieService.getAllBibliographie();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Bibliographie ", notes = "update Bibliographie\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Bibliographie does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateBibliographie", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateBibliographie(
			 @ApiParam
			 @RequestBody
			 Bibliographie o
			 ) {
		return BibliographieService.updateBibliographie(o);
		 
	 }


}
