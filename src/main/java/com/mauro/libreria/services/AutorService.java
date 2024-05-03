package com.mauro.libreria.services;

import com.mauro.libreria.entities.Autor;
import com.mauro.libreria.repositories.AutorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    private AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> getAutor(){
       if (autorRepository.findAll().isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("No hay registros"));
        }
        return autorRepository.findAll();
    }
    public Autor createAutor(Autor autor){
       return autorRepository.save(autor);
    }

    public Autor updateAutor(Integer idAutor, Autor autor){
        Optional<Autor> result= autorRepository.findById(idAutor);
        if(result.isPresent()){
            return autorRepository.save(autor);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El autor %d no existe", idAutor));
        }
    }
    public void deleteAutor(Integer idAutor){
        Optional<Autor> result= autorRepository.findById(idAutor);
        if(result.isPresent()){
             autorRepository.delete(result.get());
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El autor %d no existe", idAutor));
        }
    }
}
