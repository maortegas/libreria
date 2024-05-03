package com.mauro.libreria.controller;

import com.mauro.libreria.dto.EditorialTotalLibros;
import com.mauro.libreria.dto.IEditorialTotalLibros;
import com.mauro.libreria.entities.Editorial;
import com.mauro.libreria.services.EditorialService;
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
@RequestMapping("/editoriales")
@CrossOrigin(origins = "*")
public class EditorialController {
    @Autowired
    private EditorialService editorialService;

    @GetMapping
    @Timed(value = "editorial.time")
    public ResponseEntity<List<IEditorialTotalLibros>> getEditorial(){
        return new ResponseEntity<List<IEditorialTotalLibros>>( editorialService.getEditorial(), HttpStatus.OK);
    }

}
