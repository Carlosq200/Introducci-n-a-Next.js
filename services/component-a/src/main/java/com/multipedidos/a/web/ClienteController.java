package com.multipedidos.a.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import com.multipedidos.a.service.ClienteService;
import com.multipedidos.a.domain.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
  private final ClienteService svc;
  public ClienteController(ClienteService svc){ this.svc = svc; }

  @PostMapping
  public ResponseEntity<Cliente> create(@RequestBody Map<String,String> in){
    Cliente c = svc.create(in.getOrDefault("nombre",""), in.getOrDefault("correo",""));
    return ResponseEntity.ok(c);
  }

  @GetMapping
  public List<Cliente> list(){ return svc.list(); }
}