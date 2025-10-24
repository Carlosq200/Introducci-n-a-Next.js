package com.multipedidos.a.web;
import com.multipedidos.a.api.*; import com.multipedidos.a.domain.*; import com.multipedidos.a.repo.*; import com.multipedidos.a.service.PedidoService;
import lombok.RequiredArgsConstructor; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;

@RestController @RequiredArgsConstructor
public class ClienteController {
  private final ClienteRepository repo;
  @PostMapping("/clientes") public ResponseEntity<Cliente> create(@RequestBody ClienteInput in){
    var c = repo.save(new Cliente(null, in.nombre(), in.correo()));
    return ResponseEntity.status(HttpStatus.CREATED).body(c);
  }
  @GetMapping("/clientes") public java.util.List<Cliente> list(){ return repo.findAll(); }
  @GetMapping("/clientes/{id}") public ResponseEntity<Cliente> get(@PathVariable Long id){
    return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }
}

@RestController @RequiredArgsConstructor
class PedidoController {
  private final PedidoRepository repo; private final PedidoService service;
  @PostMapping("/pedidos") public ResponseEntity<Pedido> create(@RequestBody PedidoInput in){
    return ResponseEntity.status(HttpStatus.CREATED).body(service.create(in));
  }
  @GetMapping("/pedidos") public java.util.List<Pedido> list(){ return repo.findAll(); }
  @GetMapping("/pedidos/{id}") public ResponseEntity<Pedido> get(@PathVariable Long id){
    return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }
}
