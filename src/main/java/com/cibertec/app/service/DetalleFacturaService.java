package com.cibertec.app.service;

import java.util.List;
import com.cibertec.app.entity.DetalleFactura;

public interface DetalleFacturaService {
    List<DetalleFactura> listarTodos();
    DetalleFactura guardar(DetalleFactura detalle);
    List<DetalleFactura> buscarPorFactura(Long nroFactura);
}

