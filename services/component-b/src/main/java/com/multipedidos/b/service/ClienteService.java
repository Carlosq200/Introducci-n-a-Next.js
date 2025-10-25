package com.multipedidos.b.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.multipedidos.b.domain.Cliente;
import com.multipedidos.b.repo.ClienteRepository;

@Service
@Transactional
public class ClienteService {
  private final ClienteRepository repo;
  public ClienteService(ClienteRepository repo){ this.repo = repo; }
  public Cliente create(String nombre, String correo){ return repo.save(new Cliente(nombre, correo)); }
  public List<Cliente> list(){ return repo.findAll(); }
}