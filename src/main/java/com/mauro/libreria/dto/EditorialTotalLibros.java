package com.mauro.libreria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class EditorialTotalLibros {
    private Integer idEditorial;
    private String nombre;
    private Double totalLibros;
}
