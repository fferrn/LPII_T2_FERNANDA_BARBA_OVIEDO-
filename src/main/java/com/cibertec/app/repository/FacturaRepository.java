package com.cibertec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.app.entity.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
