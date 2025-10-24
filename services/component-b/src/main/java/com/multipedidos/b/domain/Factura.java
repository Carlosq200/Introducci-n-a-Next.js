package com.multipedidos.b.domain;
import jakarta.persistence.*; import lombok.*; import java.util.*;
@Embeddable @Data @NoArgsConstructor @AllArgsConstructor class PedidoRefEmb { private Long pedidoId; private Double total; }
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Factura {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long proveedorId;
  @ElementCollection private java.util.List<PedidoRefEmb> pedidos = new java.util.ArrayList<>();
  private Double totalFactura;
}
