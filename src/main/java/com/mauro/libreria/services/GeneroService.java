package com.mauro.libreria.services;

import com.mauro.libreria.entities.Genero;
import com.mauro.libreria.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public List<Genero> getGenero(){
        if(generoRepository.findAll().isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("No hay registros"));
        }

        return generoRepository.findAll();
    }

}
