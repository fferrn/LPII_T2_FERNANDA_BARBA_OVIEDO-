package com.cibertec.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Embeddable
public class DetalleFacturaID implements Serializable {

    @Column(name = "nro_factura")
    private Long factura;

    @Column(name = "id_prod")
    private Long producto;
}
