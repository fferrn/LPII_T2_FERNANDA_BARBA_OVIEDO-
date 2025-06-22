package com.cibertec.app.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.entity.DetalleFactura;
import com.cibertec.app.repository.DetalleFacturaRepository;
import com.cibertec.app.service.DetalleFacturaService;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {

    @Autowired
    private DetalleFacturaRepository repo;

    @Override
    public List<DetalleFactura> listarTodos() {
        return repo.findAll();
    }

    @Override
    public DetalleFactura guardar(DetalleFactura detalle) {
        return repo.save(detalle);
    }

    @Override
    public List<DetalleFactura> buscarPorFactura(Long nroFactura) {
        return repo.findAll()
                   .stream()
                   .filter(d -> d.getFactura().getNroFactura().equals(nroFactura))
                   .collect(Collectors.toList());
    }
}
