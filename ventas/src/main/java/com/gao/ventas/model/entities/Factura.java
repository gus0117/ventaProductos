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
@Table(name = "facturas")
public class Factura implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", nullable=false)
	private Cliente cliente;
	
	@Column
	private int cantidad;
	
	@Column
	private double total;
	
	public Factura() {
		
	}

	public Factura(Integer id, Cliente cliente, int cantidad, double total) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.total = total;
	}

	public Factura(Cliente cliente, int cantidad, double total) {
		super();
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", cliente=" + cliente + ", cantidad=" + cantidad + ", total=" + total + "]";
	}
	
	
}
