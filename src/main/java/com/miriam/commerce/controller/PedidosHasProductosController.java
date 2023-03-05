package com.miriam.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miriam.commerce.model.PedidosHasProductos;
import com.miriam.commerce.service.IPedidosHasProductosService;

@RestController
@CrossOrigin(origins = "*")
public class PedidosHasProductosController {
	
	@Autowired
	IPedidosHasProductosService iPedidosHasProductosService;
	
	@GetMapping("hasprod")
	public List<PedidosHasProductos> getAllPedidosHasProductos(){
		return iPedidosHasProductosService.getAllPedidosHasProductos();
	}
	@GetMapping("bypedido")
	public List<PedidosHasProductos> getPedidosHasProductosByPedido(){
		return iPedidosHasProductosService.getHasPedidosByPedidos(2L);
	}

}
