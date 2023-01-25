package com.imageMM.Models;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Signature")
public class Signature {

	@Id
	@GeneratedValue(generator = "String2")

	private String idSignature;
	private String idOeuvre;
	private String description;
	private String idLocaisation;
	public Signature() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Signature(String idSignature, String idOeuvre, String description, String idLocaisation) {
		super();
		this.idSignature = idSignature;
		this.idOeuvre = idOeuvre;
		this.description = description;
		this.idLocaisation = idLocaisation;
	}
	public String getIdSignature() {
		return idSignature;
	}
	public void setIdSignature(String idSignature) {
		this.idSignature = idSignature;
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
