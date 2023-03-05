package com.miriam.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miriam.commerce.model.Productos;

@Repository
public interface IProductosRepository extends JpaRepository<Productos, Long>{

	
	
}
