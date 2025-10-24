package com.multipedidos.a.domain;
import jakarta.persistence.*; import lombok.*; import java.util.*;
@Embeddable @Data @NoArgsConstructor @AllArgsConstructor class ProductoEmb { private String nombre; private Double precio; }
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Pedido {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long clienteId;
  @ElementCollection private java.util.List<ProductoEmb> productos = new java.util.ArrayList<>();
  private Double total;
}
