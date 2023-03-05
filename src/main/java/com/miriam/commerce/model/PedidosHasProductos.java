package com.miriam.commerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos_has_productos")
public class PedidosHasProductos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_has")
	private Long idHas;
	
	
	private Double cantidad;
	private Double subtotal;
	private String detalles;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_pedido")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Pedidos pedidos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_producto")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Productos productos;

	
	
	
	public PedidosHasProductos() {
		super();
	}

	public PedidosHasProductos(Long idHas, Double cantidad, Double subtotal, String detalles, Pedidos pedidos,
			Productos productos) {
		super();
		this.idHas = idHas;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.detalles = detalles;
		this.pedidos = pedidos;
		this.productos = productos;
	}

	public Long getIdHas() {
		return idHas;
	}

	public void setIdHas(Long idHas) {
		this.idHas = idHas;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public Pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	
	
	
	
	
}