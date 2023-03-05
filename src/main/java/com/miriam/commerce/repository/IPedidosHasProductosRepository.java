package com.miriam.commerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miriam.commerce.model.Pedidos;
import com.miriam.commerce.model.PedidosHasProductos;

@Repository
public interface IPedidosHasProductosRepository extends JpaRepository<PedidosHasProductos, Long> {
public List<PedidosHasProductos> findByPedidos(Pedidos pedidos);
}
