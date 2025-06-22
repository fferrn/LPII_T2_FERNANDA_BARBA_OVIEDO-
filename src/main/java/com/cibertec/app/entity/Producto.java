package com.cibertec.app.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prod")
    private Long idProd;

    @Column(name = "nom_prod")
    private String nomProd;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "stock_actual")
    private int stockActual;

    public void restarStock(int cantidad) {
        this.stockActual -= cantidad;
    }

    public boolean sinStock() {
        return this.stockActual <= 0;
    }
}
