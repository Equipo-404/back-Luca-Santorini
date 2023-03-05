package com.miriam.commerce.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_pedido")
	private Long idPedido;
	
	@Column (name = "monto_total")
	private Double montoTotal;
	
	@Column (name = "metodo_pago")
	private String metodoPago;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column (name = "fecha_solicitud")
	private Date fechaSolicitud;
	
	@Column(name = "fk_id_usuario")
	private Long fkIdUsuario;

		
	
	public Pedidos() {
		super();
	}

	public Pedidos(Long idPedido, Double montoTotal, String metodoPago, Date fechaSolicitud, Long fkIdUsuario) {
		super();
		this.idPedido = idPedido;
		this.montoTotal = montoTotal;
		this.metodoPago = metodoPago;
		this.fechaSolicitud = fechaSolicitud;
		this.fkIdUsuario = fkIdUsuario;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Long getFkIdUsuario() {
		return fkIdUsuario;
	}

	public void setFkIdUsuario(Long fkIdUsuario) {
		this.fkIdUsuario = fkIdUsuario;
	}

	
	
	
	
}
