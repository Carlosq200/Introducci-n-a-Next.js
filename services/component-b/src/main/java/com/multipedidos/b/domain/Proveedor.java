package com.multipedidos.b.domain;
import jakarta.persistence.*; import lombok.*;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Proveedor { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String nombre; private String correo; }
