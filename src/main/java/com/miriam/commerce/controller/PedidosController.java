package com.miriam.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miriam.commerce.model.Pedidos;
import com.miriam.commerce.service.IPedidosService;

@RestController
@CrossOrigin(origins = "*")
public class PedidosController {
	
@Autowired
IPedidosService iPedidosService;

@GetMapping("pedidos")
public List<Pedidos> getAllPedidos(){
	return iPedidosService.getAllPedidos();
}
	
}
