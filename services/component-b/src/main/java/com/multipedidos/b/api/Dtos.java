package com.multipedidos.b.api; import java.util.List;
public record ProveedorInput(String nombre, String correo) {}
public record PedidoReferencia(Long pedidoId, Double total) {}
public record FacturaInput(Long proveedorId, List<PedidoReferencia> pedidos) {}
