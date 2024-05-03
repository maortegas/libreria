package com.mauro.libreria.controller;

import com.mauro.libreria.Datos;
import com.mauro.libreria.services.AutorService;
import org.apache.tomcat.util.descriptor.web.FragmentJarScannerCallback;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AutorController.class)
class AutControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private AutorService autorService;

    @Test
    void testGetAutor() throws Exception {
    when(autorService.getAutor()).thenReturn(Datos.AUTORS);


        mvc.perform(get("/autores").contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());

    }


}