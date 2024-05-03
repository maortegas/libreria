package com.mauro.libreria.repositories;

import com.mauro.libreria.entities.OrdenesLibros;
import com.mauro.libreria.entities.OrderLibroPK;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesLibrosRepository extends JpaRepository<OrdenesLibros, OrderLibroPK> {
}
