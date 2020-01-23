package com.gao.ventas.model.entities;

import java.io.Serializable;

public class Factura implements Serializable{
	private Integer id;
	private Cliente cliente;
	private int cantidad;
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
