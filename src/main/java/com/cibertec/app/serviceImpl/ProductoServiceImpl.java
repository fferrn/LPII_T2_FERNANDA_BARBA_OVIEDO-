package com.cibertec.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.entity.Producto;
import com.cibertec.app.repository.ProductoRepository;
import com.cibertec.app.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repo;

    @Override
    public List<Producto> listarTodos() {
        return repo.findAll();
    }

    @Override
    public Producto obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Producto guardar(Producto producto) {
        return repo.save(producto);
    }
}
