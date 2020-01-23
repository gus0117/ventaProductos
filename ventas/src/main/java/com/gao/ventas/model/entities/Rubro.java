package com.gao.ventas.model.entities;

import java.io.Serializable;

public class Rubro implements Serializable{
	private Integer id;
	private String nombre;
	
	public Rubro() {
		
	}

	public Rubro(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Rubro(String nombre) {
		super();
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Rubro [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
