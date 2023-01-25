package com.imageMM.Models;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Pret")
public class Pret {

	@Id
	@GeneratedValue(generator = "String2")

	private String id;
	private String institution;
	private String idExposition;
	private String nomExposition;
	private Date date_dep;
	private Date date_ret;
	public Pret() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pret(String id, String institution, String idExposition, String nomExposition, Date date_dep,
			Date date_ret) {
		super();
		this.id = id;
		this.institution = institution;
		this.idExposition = idExposition;
		this.nomExposition = nomExposition;
		this.date_dep = date_dep;
		this.date_ret = date_ret;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getIdExposition() {
		return idExposition;
	}
	public void setIdExposition(String idExposition) {
		this.idExposition = idExposition;
	}
	public String getNomExposition() {
		return nomExposition;
	}
	public void setNomExposition(String nomExposition) {
		this.nomExposition = nomExposition;
	}
	public Date getDate_dep() {
		return date_dep;
	}
	public void setDate_dep(Date date_dep) {
		this.date_dep = date_dep;
	}
	public Date getDate_ret() {
		return date_ret;
	}
	public void setDate_ret(Date date_ret) {
		this.date_ret = date_ret;
	}
	
	
	
}
