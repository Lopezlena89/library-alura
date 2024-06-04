package com.alura.libreria.service;

import com.alura.libreria.dto.LibrosDTO;
import com.alura.libreria.model.Libros;
import com.alura.libreria.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibrosService {

    @Autowired
    private LibrosRepository repositorio;

    public List<LibrosDTO> obtenerLibros() {
        return convertirDatos(repositorio.findAll());
    }

    public List<LibrosDTO> convertirDatos(List<Libros> libro) {
        return libro.stream()
                .map(l -> new LibrosDTO(
                        l.getId(),
                        l.getTitulo(),
                        l.getAutor(),
                        l.getIdioma(),
                        l.getDescargas()
                ))
                .collect(Collectors.toList());
    }
}