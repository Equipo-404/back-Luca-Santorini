package com.miriam.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miriam.commerce.model.Pedidos;

@Repository
public interface IPedidosRepository extends JpaRepository<Pedidos, Long>{

}
