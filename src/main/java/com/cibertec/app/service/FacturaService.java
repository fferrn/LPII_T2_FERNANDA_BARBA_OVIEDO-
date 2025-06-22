package com.cibertec.app.service;

import java.util.List;
import com.cibertec.app.entity.Factura;

public interface FacturaService {
    List<Factura> listarTodas();
    Factura guardar(Factura factura);
    Factura obtenerPorId(Long id);
}
