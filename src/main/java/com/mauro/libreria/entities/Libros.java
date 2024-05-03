package com.mauro.libreria.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="libros")
public class Libros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer idLibro;

    @Column(name = "titulo", length = 100)
    private String titulo;

    @Column(name = "resena", length = 255)
    private String resena;

    @Column(name = "urlImagen")
    private String urlImagen;

    @Column(name = "precio")
    private Integer precio;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "destacado")
    private Boolean destacado;

    @ManyToOne
    @JoinColumn(name = "id_autor", referencedColumnName = "id_autor")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "id_editorial", referencedColumnName = "id_editorial")
    private Editorial editorial;

    @ManyToOne
    @JoinColumn(name = "id_genero", referencedColumnName = "id_genero")
    private Genero genero;
}
