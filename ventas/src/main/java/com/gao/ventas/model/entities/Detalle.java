package com.gao.ventas.model.entities;

import java.io.Serializable;

public class Detalle implements Serializable{
	private Integer id;
	private Producto producto;
	private Factura factura;
	private double subtotal;
	
	public Detalle() {
		
	}

	public Detalle(Integer id, Producto producto, Factura factura, double subtotal) {
		super();
		this.id = id;
		this.producto = producto;
		this.factura = factura;
		this.subtotal = subtotal;
	}

	public Detalle(Producto producto, Factura factura, double subtotal) {
		super();
		this.producto = producto;
		this.factura = factura;
		this.subtotal = subtotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "Detalle [id=" + id + ", producto=" + producto + ", factura=" + factura + ", subtotal=" + subtotal + "]";
	}
	
	
}
