package com.miriam.commerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miriam.commerce.model.Pedidos;
import com.miriam.commerce.repository.IPedidosRepository;

@Service
public class PedidosService implements IPedidosService{
	
	@Autowired 
	private IPedidosRepository iPedidosRepository;

	@Override
	public List<Pedidos> getAllPedidos() {
		// TODO Auto-generated method stub
		return iPedidosRepository.findAll();
	}
	

	
	

}
