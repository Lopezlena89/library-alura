package com.alura.libreria.service;

import com.alura.libreria.dto.AutoresDTO;
import com.alura.libreria.model.Autores;
import com.alura.libreria.repository.AutoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class AutoresService {
    @Autowired
    private AutoresRepository repositorio;

    public List<AutoresDTO> obtenerLosAutores() {
        return convertirDatos(repositorio.findAll());
    }

    public List<AutoresDTO> convertirDatos(List<Autores> autor) {
        return autor.stream()
                .map(a -> new AutoresDTO(
                        a.getId(),
                        a.getNombre(),
                        a.getNacimiento(),
                        a.getDeceso()
                ))
                .collect(Collectors.toList());
    }
}