package com.mauro.libreria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrderLibroPK {
    @Column(name = "id_orden")
    private Integer idOrden;

    @Column(name = "id_libro")
    private Integer idLibro;
}
