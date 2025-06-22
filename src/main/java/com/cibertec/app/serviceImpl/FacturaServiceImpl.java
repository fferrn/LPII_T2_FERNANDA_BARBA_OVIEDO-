package com.cibertec.app.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.entity.Factura;
import com.cibertec.app.repository.FacturaRepository;
import com.cibertec.app.service.FacturaService;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository repo;

    @Override
    public List<Factura> listarTodas() {
        return repo.findAll();
    }

    @Override
    public Factura guardar(Factura factura) {
        return repo.save(factura);
    }

    @Override
    public Factura obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }
}
