package com.mauro.libreria.controller;

import com.mauro.libreria.entities.Autor;
import com.mauro.libreria.services.AutorService;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/autores")
@CrossOrigin(origins = "*")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @GetMapping
    //@Timed(value = "autor.timer")
    private ResponseEntity<List<Autor>> getAutor(){

        return new ResponseEntity<List<Autor>>(autorService.getAutor(), HttpStatus.OK);
    }
    /*

    @PostMapping
    public ResponseEntity<Autor> createAutor(@RequestBody Autor autor){
        return new ResponseEntity<Autor>(autorService.createAutor(autor), HttpStatus.CREATED);
    }
    @PutMapping("/{idAutor}")
    public ResponseEntity<Autor> updateAutor(@PathVariable("idAutor") Integer idAutor, @RequestBody Autor autor){
        return new ResponseEntity<Autor>(autorService.updateAutor(idAutor, autor), HttpStatus.OK);
    }

    @DeleteMapping("/{idAutor}")
    public ResponseEntity<Void> deleteAutor(@PathVariable("idAutor") Integer idAutor){
        autorService.deleteAutor(idAutor);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

     */
}
