package com.alura.libreria.repository;

import com.alura.libreria.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibrosRepository extends JpaRepository<Libros,Long> {
    Optional<Libros> findByTituloContainingIgnoreCase(String nombreLibro);
}