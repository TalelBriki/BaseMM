package com.imageMM.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Restauration")
public class Restauration {
	
	@Id
	@GeneratedValue(generator = "String2")

	private String id;
	private String idOeuvre;
	private String constat;
	private String causes;
	private Date date_rest;
	private String lieu_rest;
	private String nom_rest;
	private String type_inventraire;
	private List<String> materiaux_techniques;
	public Restauration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restauration(String id, String constat, String causes, Date date_rest, String lieu_rest,
			String nom_rest, String type_inventraire, List<String> materiaux_techniques,String idOeuvre) {
		super();
		this.id = id;
		this.constat = constat;
		this.causes = causes;
		this.date_rest = date_rest;
		this.lieu_rest = lieu_rest;
		this.nom_rest = nom_rest;
		this.type_inventraire = type_inventraire;
		this.materiaux_techniques = materiaux_techniques;
		this.idOeuvre=idOeuvre;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getConstat() {
		return constat;
	}
	public void setConstat(String constat) {
		this.constat = constat;
	}
	public String getCauses() {
		return causes;
	}
	public void setCauses(String causes) {
		this.causes = causes;
	}
	public Date getDate_rest() {
		return date_rest;
	}
	public void setDate_rest(Date date_rest) {
		this.date_rest = date_rest;
	}
	public String getLieu_rest() {
		return lieu_rest;
	}
	public void setLieu_rest(String lieu_rest) {
		this.lieu_rest = lieu_rest;
	}
	public String getNom_rest() {
		return nom_rest;
	}
	public void setNom_rest(String nom_rest) {
		this.nom_rest = nom_rest;
	}
	public String getType_inventraire() {
		return type_inventraire;
	}
	public void setType_inventraire(String type_inventraire) {
		this.type_inventraire = type_inventraire;
	}
	public List<String> getMateriaux_techniques() {
		return materiaux_techniques;
	}
	public void setMateriaux_techniques(List<String> materiaux_techniques) {
		this.materiaux_techniques = materiaux_techniques;
	}
	public String getIdOeuvre() {
		return idOeuvre;
	}
	public void setIdOeuvre(String idOeuvre) {
		this.idOeuvre = idOeuvre;
	}
	
	
	
}
