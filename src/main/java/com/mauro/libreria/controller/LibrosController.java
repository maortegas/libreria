package com.mauro.libreria.controller;

import com.mauro.libreria.entities.Libros;
import com.mauro.libreria.services.LibrosService;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
@CrossOrigin(origins = "*")
public class LibrosController {

    @Autowired
    private LibrosService librosService;
    @GetMapping("/filtros")
    @Timed(value = "libro.time")
    public ResponseEntity<List<Libros>> getLibros(){
        return new ResponseEntity<List<Libros>>(librosService.getLibros(), HttpStatus.OK);
    }

    @GetMapping("/{idLibro}")
    public ResponseEntity<Libros> getLibros(@PathVariable("idLibro") Integer idLibro){
        return new ResponseEntity<Libros>(librosService.getLibrosById(idLibro), HttpStatus.OK);
    }

}
