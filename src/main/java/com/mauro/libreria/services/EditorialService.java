package com.mauro.libreria.services;

import com.mauro.libreria.dto.IEditorialTotalLibros;
import com.mauro.libreria.repositories.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialService {
    @Autowired
    private EditorialRepository editorialRepository;

    public List<IEditorialTotalLibros> getEditorial(){
        return editorialRepository.getTotalLibrosEditorial();
    }
}
