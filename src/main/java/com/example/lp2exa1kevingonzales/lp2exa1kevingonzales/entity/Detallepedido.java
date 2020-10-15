package com.example.lp2exa1kevingonzales.lp2exa1kevingonzales.entity;

public class Detallepedido {
	private int iddetalle_pedido;
	private String precio;
	private String cantidad;
	private int idplatos;
	private int idpedidos;
	
	
	
	
	
	public Detallepedido() {
		super();
	}
	public Detallepedido(int iddetalle_pedido, String precio, String cantidad, int idplatos, int idpedidos) {
		super();
		this.iddetalle_pedido = iddetalle_pedido;
		this.precio = precio;
		this.cantidad = cantidad;
		this.idplatos = idplatos;
		this.idpedidos = idpedidos;
	}
	public int getIddetalle_pedido() {
		return iddetalle_pedido;
	}
	public void setIddetalle_pedido(int iddetalle_pedido) {
		this.iddetalle_pedido = iddetalle_pedido;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdplatos() {
		return idplatos;
	}
	public void setIdplatos(int idplatos) {
		this.idplatos = idplatos;
	}
	public int getIdpedidos() {
		return idpedidos;
	}
	public void setIdpedidos(int idpedidos) {
		this.idpedidos = idpedidos;
	}
	
	
	
	
	
}
