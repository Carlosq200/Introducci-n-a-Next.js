package com.multipedidos.a.api; import java.util.List;
public record ClienteInput(String nombre, String correo) {}
public record Producto(String nombre, Double precio) {}
public record PedidoInput(Long clienteId, List<Producto> productos) {}
