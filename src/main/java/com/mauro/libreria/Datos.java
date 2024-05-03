package com.mauro.libreria;

import com.mauro.libreria.entities.Autor;

import java.util.Arrays;
import java.util.List;

public class Datos {
    public final static List<Autor> AUTORS = Arrays.asList(new Autor(1, "Matemáticas"),
            new Autor(6, "Lenguaje"),
            new Autor(7, "Historia"));
}
