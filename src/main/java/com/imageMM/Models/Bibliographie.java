package com.imageMM.Models;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class Bibliographie {
	
	@Id
	@GeneratedValue(generator = "String2")

	private String id;
	private String idOeuvre;
	private String nom_auteur;
	private Date date_pub;
	private int page;
	private String editeur;
	public Bibliographie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bibliographie(String id, String idOeuvre, String nom_auteur, Date date_pub, int page,
			String editeur) {
		super();
		this.id = id;
		this.idOeuvre = idOeuvre;
		this.nom_auteur = nom_auteur;
		this.date_pub = date_pub;
		this.page = page;
		this.editeur = editeur;
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
	public String getnom_auteur() {
		return nom_auteur;
	}
	public void setnom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}
	public Date getDate_pub() {
		return date_pub;
	}
	public void setDate_pub(Date date_pub) {
		this.date_pub = date_pub;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getediteur() {
		return editeur;
	}
	public void setediteur(String editeur) {
		this.editeur = editeur;
	}
	@Override
	public String toString() {
		return "Bibliographie [id=" + id + ", idOeuvre=" + idOeuvre + ", nom_auteur=" + nom_auteur
				+ ", date_pub=" + date_pub + ", page=" + page + ", editeur=" + editeur + "]";
	}
	
	
	
	
	
	

}
