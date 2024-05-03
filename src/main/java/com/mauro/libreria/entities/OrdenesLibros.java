package com.mauro.libreria.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ordenes_libros")
public class OrdenesLibros {

    @EmbeddedId
    private OrderLibroPK id;

    @ManyToOne
    @JoinColumn(name = "id_orden", referencedColumnName = "id_orden", insertable = false, updatable = false)
    @MapsId("idOrden")
    private Ordenes ordenes;


    private Integer cantidad;
    private Integer monto;
}
