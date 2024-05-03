package com.mauro.libreria.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ordenes")
public class Ordenes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden")
    private Integer idOrden;

    @Column(name = "fecha_orden")
    private Timestamp fechaOrden;

    @Column(name = "monto")
    private Integer monto;

    @ManyToOne
    private Usuarios usuarios;

    @OneToMany(mappedBy = "ordenes", cascade = CascadeType.PERSIST)
    private List<OrdenesLibros> details;

}
