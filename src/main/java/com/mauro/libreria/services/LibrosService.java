package com.mauro.libreria.services;

import com.mauro.libreria.entities.Libros;
import com.mauro.libreria.repositories.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LibrosService {
    @Autowired
    private LibrosRepository librosRepository;

    public List<Libros> getLibros(){
        return librosRepository.findAll();
    }

    public Libros getLibrosById(Integer idLibro){
        return librosRepository.findById(idLibro).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("No hay %d", idLibro)));
    }


}
