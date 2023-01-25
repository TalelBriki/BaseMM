package com.imageMM.Models;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class Image {

	@Id
	@GeneratedValue(generator = "String2")

	private String id;
	private int nb_inventaire;
	private String copyright_notice;
	private List<String> tags;
	private String droits_photographiques;
	private String url;
	private String idOeuvre;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(String copyright_notice, List<String> tags, String droits_photographiques, String url,
			String idOeuvre, int nb_inventaire,
			String id
			) {
		super();
		this.copyright_notice = copyright_notice;
		this.tags = tags;
		this.droits_photographiques = droits_photographiques;
		this.url = url;
		this.idOeuvre = idOeuvre;
		this.nb_inventaire=nb_inventaire;
		this.id=id;
	}
	public String getCopyright_notice() {
		return copyright_notice;
	}
	public void setCopyright_notice(String copyright_notice) {
		this.copyright_notice = copyright_notice;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getDroits_photographiques() {
		return droits_photographiques;
	}
	public void setDroits_photographiques(String droits_photographiques) {
		this.droits_photographiques = droits_photographiques;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIdOeuvre() {
		return idOeuvre;
	}
	public void setIdOeuvre(String idOeuvre) {
		this.idOeuvre = idOeuvre;
	}
	public int getNb_inventaire() {
		return nb_inventaire;
	}
	public void setNb_inventaire(int nb_inventaire) {
		this.nb_inventaire = nb_inventaire;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	

}
