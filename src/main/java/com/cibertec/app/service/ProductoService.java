package com.cibertec.app.service;

import java.util.List;
import com.cibertec.app.entity.Producto;

public interface ProductoService {
    List<Producto> listarTodos();
    Producto obtenerPorId(Long id);
    Producto guardar(Producto producto);
}

