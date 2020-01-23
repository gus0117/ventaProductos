package com.gao.ventas.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name="producto_id", nullable=false)
	private Producto producto;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name="factura_id", nullable=false)
	private Factura factura;
	
	@Column
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
