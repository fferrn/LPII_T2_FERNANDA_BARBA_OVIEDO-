package com.cibertec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.app.entity.DetalleFactura;
import com.cibertec.app.entity.DetalleFacturaID;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, DetalleFacturaID> {
}

