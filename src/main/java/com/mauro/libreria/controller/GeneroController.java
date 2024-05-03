package com.mauro.libreria.controller;

import com.mauro.libreria.entities.Genero;
import com.mauro.libreria.services.GeneroService;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/generos")
@CrossOrigin(origins = "*")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @GetMapping
    @Timed(value = "genero.time")
    public ResponseEntity<List<Genero>> getGenero(){
        return new ResponseEntity<List<Genero>>( generoService.getGenero(), HttpStatus.OK);
    }
}
