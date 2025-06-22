package com.cibertec.app.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.entity.Cliente;
import com.cibertec.app.repository.ClienteRepository;
import com.cibertec.app.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repo;

    @Override
    public List<Cliente> listarTodos() {
        return repo.findAll();
    }

    @Override
    public Cliente obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return repo.save(cliente);
    }
}

