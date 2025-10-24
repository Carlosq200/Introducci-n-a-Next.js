package com.multipedidos.b.web;
import com.multipedidos.b.api.*; import com.multipedidos.b.domain.*; import com.multipedidos.b.repo.*; import com.multipedidos.b.service.FacturaService;
import lombok.RequiredArgsConstructor; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;

@RestController @RequiredArgsConstructor
public class ProveedorController {
  private final ProveedorRepository repo;
  @PostMapping("/proveedores") public ResponseEntity<Proveedor> create(@RequestBody ProveedorInput in){
    var p = repo.save(new Proveedor(null, in.nombre(), in.correo()));
    return ResponseEntity.status(HttpStatus.CREATED).body(p);
  }
  @GetMapping("/proveedores") public java.util.List<Proveedor> list(){ return repo.findAll(); }
}

@RestController @RequiredArgsConstructor
class FacturaController {
  private final FacturaRepository repo; private final FacturaService service;
  @PostMapping("/facturas") public ResponseEntity<Factura> create(@RequestBody FacturaInput in){
    return ResponseEntity.status(HttpStatus.CREATED).body(service.create(in));
  }
  @GetMapping("/facturas") public java.util.List<Factura> list(){ return repo.findAll(); }
  @GetMapping("/facturas/{id}") public ResponseEntity<Factura> get(@PathVariable Long id){
    return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }
}
