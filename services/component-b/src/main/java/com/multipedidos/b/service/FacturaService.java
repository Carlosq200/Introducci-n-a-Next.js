package com.multipedidos.b.service;
import com.multipedidos.b.api.*; import com.multipedidos.b.domain.*; import com.multipedidos.b.repo.FacturaRepository;
import lombok.RequiredArgsConstructor; import org.springframework.stereotype.Service; import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient; import java.util.Map;
@Service @RequiredArgsConstructor
public class FacturaService {
  private final FacturaRepository repo;
  private final WebClient http = WebClient.create();
  @Value("\") private String aBase;

  public Factura create(FacturaInput in){
    double subtotal = in.pedidos().stream().mapToDouble(p -> p.total()==null? obtenerTotalDesdeA(p.pedidoId()) : p.total()).sum();
    double total = com.multipedidos.common.OperacionesNegocio.calcularTotalConIVA(subtotal);
    Factura f = new Factura(); f.setProveedorId(in.proveedorId());
    f.setPedidos(in.pedidos().stream().map(p -> new PedidoRefEmb(p.pedidoId(), p.total()==null? obtenerTotalDesdeA(p.pedidoId()) : p.total())).toList());
    f.setTotalFactura(total); return repo.save(f);
  }

  private double obtenerTotalDesdeA(Long pedidoId){
    try{
      Map resp = http.get().uri(aBase + "/pedidos/{id}", pedidoId).retrieve().bodyToMono(Map.class).block();
      Object t = resp.get("total"); return t==null?0d: Double.parseDouble(t.toString());
    }catch(Exception e){ return 0d; }
  }
}
