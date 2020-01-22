package com.gao.ventas.entities;

import java.io.Serializable;

public class Cliente implements Serializable{
	private Integer id;
	private String apellido;
	private String nombre;
	private long dni;
	
	public Cliente() {
		
	}

	public Cliente(Integer id, String apellido, String nombre, long dni) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}

	public Cliente(String apellido, String nombre, long dni) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
}
