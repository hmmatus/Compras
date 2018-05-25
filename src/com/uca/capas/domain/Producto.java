package com.uca.capas.domain;

public class Producto {
	private int id;
	private String nomProducto;
	private String descProducto;
	private double precioProducto;
	private String image;
	
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomProducto() {
		return nomProducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
	public String getDescProducto() {
		return descProducto;
	}
	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {

		this.precioProducto = precioProducto;
	}
	//Constructor
	public Producto(int id, String nomProducto, String descProducto, double precioProducto,String image) {
		super();
		this.id = id;
		this.nomProducto = nomProducto;
		this.descProducto = descProducto;
		this.precioProducto = precioProducto;
		this.image=image;
	}
	//Constructor vacio
	public Producto() {}
	

}
