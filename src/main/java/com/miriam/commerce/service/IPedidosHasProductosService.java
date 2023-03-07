package com.miriam.commerce.service;

import java.util.List;

import com.miriam.commerce.model.PedidosHasProductos;

public interface IPedidosHasProductosService {
public List<PedidosHasProductos> getAllPedidosHasProductos();

public List<PedidosHasProductos> getHasPedidosByPedidos(Long id);

public void deleteHasPedidosByPedidos(Long id);


}
