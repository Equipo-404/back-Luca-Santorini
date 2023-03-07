package com.miriam.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miriam.commerce.model.Productos;
import com.miriam.commerce.repository.IProductosRepository;
import com.miriam.commerce.service.IProductoService;

@RestController
@CrossOrigin(origins = "*")
public class ProductosController {

	@Autowired
	IProductoService iProductoService;
	
	@GetMapping("productos")
	public ResponseEntity<List<Productos>> getAllProductos() {
	    List<Productos> productos = iProductoService.getAllProductos();
	    return ResponseEntity.ok(productos);
	}
	@GetMapping("prod")
	public String hola(){
		return "hola";
	}
	
	/*@GetMapping("producto")
	public Productos getAllProducto(){
		Productos productos = iProductosRepository.findById(1L).orElse(null);
		return productos;
	}*/
}
