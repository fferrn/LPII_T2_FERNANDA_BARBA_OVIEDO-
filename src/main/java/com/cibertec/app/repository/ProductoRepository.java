package com.cibertec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.app.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

