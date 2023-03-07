package com.miriam.commerce.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.miriam.commerce.model.Pedidos;
import com.miriam.commerce.model.PedidosHasProductos;
import com.miriam.commerce.repository.IPedidosHasProductosRepository;
import com.miriam.commerce.repository.IPedidosRepository;

@Service
public class PedidosHasProductosService implements IPedidosHasProductosService{

	@Autowired
	private IPedidosHasProductosRepository iPedidosHasProductosRepository;
	
	
	private Pedidos pedidos;
	
	@Autowired
	private IPedidosRepository iPedidosRepository;
	
	
	
	@Override
	public List<PedidosHasProductos> getAllPedidosHasProductos() {
		// TODO Auto-generated method stub
		return iPedidosHasProductosRepository.findAll();
	}

	@Override
	public List<PedidosHasProductos> getHasPedidosByPedidos(Long id) {
		
		pedidos = iPedidosRepository.findById(id).orElse(null);
		
		List<PedidosHasProductos> listaPedidos = iPedidosHasProductosRepository.findByPedidos(pedidos);
		if(listaPedidos == null) {
			return Collections.emptyList();
		}
		else {
			return listaPedidos;
		}
	}

	@Override
	public void deleteHasPedidosByPedidos(Long id) {
		iPedidosHasProductosRepository.deleteById(id);
		
	}

	
}
