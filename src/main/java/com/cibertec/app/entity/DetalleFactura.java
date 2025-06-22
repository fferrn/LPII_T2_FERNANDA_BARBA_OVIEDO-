package com.cibertec.app.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "detallefact")
public class DetalleFactura implements Serializable {

    @EmbeddedId
    private DetalleFacturaID id;

    @ManyToOne
    @MapsId("factura")
    @JoinColumn(name = "nro_factura")
    private Factura factura;

    @ManyToOne
    @MapsId("producto")
    @JoinColumn(name = "id_prod")
    private Producto producto;

    @Column(name = "cantidad")
    private int cantidad;
}

