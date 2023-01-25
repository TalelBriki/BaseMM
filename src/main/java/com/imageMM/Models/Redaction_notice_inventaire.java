package com.imageMM.Models;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Redaction_notice_inventaire")
public class Redaction_notice_inventaire {

	@Id
	
	@GeneratedValue(generator = "String2")

	private String id;
	private String nom_redacteur;
	private Date date_red;
	private Date date_modif;
	public Redaction_notice_inventaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Redaction_notice_inventaire(String id, String nom_redacteur, Date date_red, Date date_modif) {
		super();
		this.id = id;
		this.nom_redacteur = nom_redacteur;
		this.date_red = date_red;
		this.date_modif = date_modif;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom_redacteur() {
		return nom_redacteur;
	}
	public void setNom_redacteur(String nom_redacteur) {
		this.nom_redacteur = nom_redacteur;
	}
	public Date getDate_red() {
		return date_red;
	}
	public void setDate_red(Date date_red) {
		this.date_red = date_red;
	}
	public Date getDate_modif() {
		return date_modif;
	}
	public void setDate_modif(Date date_modif) {
		this.date_modif = date_modif;
	}
	@Override
	public String toString() {
		return "Redaction_notice_inventaire [id=" + id + ", nom_redacteur=" + nom_redacteur + ", date_red="
				+ date_red + ", date_modif=" + date_modif + "]";
	}
	
	
	
	
	
}
