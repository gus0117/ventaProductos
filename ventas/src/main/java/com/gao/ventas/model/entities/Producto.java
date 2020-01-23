package com.gao.ventas.model.entities;

import java.io.Serializable;

public class Producto implements Serializable{
	private Integer id;
	private String descripcion;
	private double precio;
	private Rubro rubro;
	
	public Producto() {
		
	}

	public Producto(Integer id, String descripcion, double precio, Rubro rubro) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.rubro = rubro;
	}

	public Producto(String descripcion, double precio, Rubro rubro) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.rubro = rubro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Rubro getRubro() {
		return rubro;
	}

	public void setRubro(Rubro rubro) {
		this.rubro = rubro;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", rubro=" + rubro + "]";
	}
	
	
}
