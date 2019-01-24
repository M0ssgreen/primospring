package com.solutec.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String mail;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User( String nom, String mail) {
		super();
		this.nom = nom;
		this.mail = mail;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
}
