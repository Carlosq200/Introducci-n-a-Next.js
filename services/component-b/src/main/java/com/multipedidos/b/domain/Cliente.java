package com.multipedidos.b.domain;

import jakarta.persistence.*;

@Entity
public class Cliente {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String correo;

  public Cliente() {}
  public Cliente(String nombre, String correo){
    this.nombre = nombre; this.correo = correo;
  }

  public Long getId(){ return id; }
  public String getNombre(){ return nombre; }
  public void setNombre(String v){ this.nombre = v; }
  public String getCorreo(){ return correo; }
  public void setCorreo(String v){ this.correo = v; }
}