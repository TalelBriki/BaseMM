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

import com.imageMM.Models.Artiste;
import com.imageMM.service.ArtisteService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class ArtisteEndPoint {
     @Autowired
     ArtisteService ArtisteService;
	
	
	
	 @ApiOperation(value = "create new Artiste", notes = "return  the new Artiste created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createArtiste", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createArtiste(
			@ApiParam
			@RequestBody
			Artiste Artiste)
	{
	return ArtisteService.createArtiste(Artiste);
	}
	

	
	
	 @ApiOperation(value = "delete given Artiste", notes = "delete  a given Artiste.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteArtiste/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteArtiste(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return ArtisteService.deleteArtiste(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Artiste by id", notes = "get Artiste by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getArtisteById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getArtisteById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return ArtisteService.getArtisteById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Artiste list", notes = "get Artiste by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllArtiste", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllArtiste() {
		return ArtisteService.getAllArtiste();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Artiste ", notes = "update Artiste\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Artiste does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateArtiste", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateArtiste(
			 @ApiParam
			 @RequestBody
			 Artiste o
			 ) {
		return ArtisteService.updateArtiste(o);
		 
	 }


}
