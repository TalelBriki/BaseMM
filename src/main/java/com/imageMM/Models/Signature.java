package com.imageMM.Models;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Signature")
public class Signature {

	@Id
	@GeneratedValue(generator = "String2")

	private String id;
	private String idOeuvre;
	private String description;
	private String idLocaisation;
	public Signature() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Signature(String id, String idOeuvre, String description, String idLocaisation) {
		super();
		this.id = id;
		this.idOeuvre = idOeuvre;
		this.description = description;
		this.idLocaisation = idLocaisation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdOeuvre() {
		return idOeuvre;
	}
	public void setIdOeuvre(String idOeuvre) {
		this.idOeuvre = idOeuvre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIdLocaisation() {
		return idLocaisation;
	}
	public void setIdLocaisation(String idLocaisation) {
		this.idLocaisation = idLocaisation;
	}
	
	
	
}
