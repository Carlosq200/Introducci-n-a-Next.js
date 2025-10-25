package com.multipedidos.b.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.multipedidos.b.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}