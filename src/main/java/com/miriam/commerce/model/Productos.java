package com.miriam.commerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name = "productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Long idProducto;
	
	private String nombre;
	private String talla;
	private String color;
	private String descripcion;
	private Double precio;
	private String foto;
	private String fotop;
	
	
	
	public Productos() {
		super();
	}
	public Productos(Long idProducto, String nombre, String color, String descripcion, Double precio,
			String foto, String fotop) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		
		this.color = color;
		this.descripcion = descripcion;
		this.precio = precio;
		this.foto = foto;
		this.fotop = fotop;
	}
	public String getFotop() {
		return fotop;
	}
	public void setFotop(String fotop) {
		this.fotop = fotop;
	}
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	
		
	

	
	
}
