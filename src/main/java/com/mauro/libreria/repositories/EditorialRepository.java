package com.mauro.libreria.repositories;

import com.mauro.libreria.dto.IEditorialTotalLibros;
import com.mauro.libreria.entities.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer> {
    @Query( value = "SELECT a.id_editorial IdEditorial, a.nombre Nombre, c.totalLibro TotalLibro " +
            "FROM editorial a LEFT JOIN  (SELECT COUNT(id_editorial) totalLibro, id_editorial FROM libros GROUP BY  id_editorial)  c " +
            "on a.id_editorial = c.id_editorial", nativeQuery = true
  )
    List<IEditorialTotalLibros> getTotalLibrosEditorial();
}
