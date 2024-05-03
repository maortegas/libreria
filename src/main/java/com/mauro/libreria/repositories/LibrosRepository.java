package com.mauro.libreria.repositories;

import com.mauro.libreria.dto.EditorialTotalLibros;
import com.mauro.libreria.entities.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LibrosRepository extends JpaRepository<Libros,Integer> {

}
