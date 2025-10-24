package com.multipedidos.a.service;
import com.multipedidos.a.api.*; import com.multipedidos.a.domain.*; import com.multipedidos.a.repo.PedidoRepository;
import lombok.RequiredArgsConstructor; import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class PedidoService {
  private final PedidoRepository repo;
  public Pedido create(PedidoInput in){
    double subtotal = in.productos().stream().mapToDouble(p -> p.precio()==null?0:p.precio()).sum();
    double total = com.multipedidos.common.OperacionesNegocio.calcularTotalConIVA(subtotal);
    Pedido p = new Pedido(); p.setClienteId(in.clienteId());
    p.setProductos(in.productos().stream().map(x->new ProductoEmb(x.nombre(),x.precio())).toList());
    p.setTotal(total); return repo.save(p);
  }
}
