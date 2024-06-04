package com.alura.libreria.repository;

import com.alura.libreria.model.Autores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AutoresRepository extends JpaRepository<Autores, Long> {
    Optional<Autores> findByNombreContainingIgnoreCase(String nombreAutor);
}