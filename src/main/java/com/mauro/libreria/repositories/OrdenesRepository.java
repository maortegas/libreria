package com.mauro.libreria.repositories;

import com.mauro.libreria.entities.Ordenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesRepository extends JpaRepository<Ordenes,Integer> {
}
