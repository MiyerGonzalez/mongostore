package com.equipo5.misiontic2022.tiendasgenericas.tiendasvirtuales.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario {

	@Id
	private String id;
	
	private String username;
	
	private String password;
	
	private String nombreusuario;
	
	private String emailusuario;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Usuario(String username, String password, String nombreusuario, String emailusuario) {
		super();
		this.username = username;
		this.password = password;
		this.nombreusuario = nombreusuario;
		this.emailusuario = emailusuario;
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the nombreususario
	 */
	public String getNombreusuario() {
		return nombreusuario;
	}

	/**
	 * @param nombreususario the nombreususario to set
	 */
	public void setNombreususario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	/**
	 * @return the emailusuario
	 */
	public String getEmailusuario() {
		return emailusuario;
	}

	/**
	 * @param emailusuario the emailusuario to set
	 */
	public void setEmailusuario(String emailusuario) {
		this.emailusuario = emailusuario;
	}
	
}
