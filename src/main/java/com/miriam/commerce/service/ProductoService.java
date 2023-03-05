package com.miriam.commerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miriam.commerce.model.Productos;
import com.miriam.commerce.repository.IProductosRepository;

import lombok.AllArgsConstructor;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private IProductosRepository iProductosRepository;

	@Override
	public List<Productos> getAllProductos() {
		// TODO Auto-generated method stub
		return (List<Productos>) iProductosRepository.findAll();
	}
	
	
	

}
