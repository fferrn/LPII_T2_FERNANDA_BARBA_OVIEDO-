package com.cibertec.app.service;

import java.util.List;
import com.cibertec.app.entity.Cliente;

public interface ClienteService {
    List<Cliente> listarTodos();
    Cliente obtenerPorId(Long id);
    Cliente guardar(Cliente cliente);
}

