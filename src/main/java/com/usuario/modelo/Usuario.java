package com.usuario.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "GENERO")
	private String genero;
	@Column(name = "ESTATUS")
	private String estatus;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer id, String nombre, String email, String genero, String estatus) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
		this.estatus = estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
	
	

}
