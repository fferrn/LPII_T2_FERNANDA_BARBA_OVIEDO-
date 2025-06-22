package com.cibertec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.app.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

