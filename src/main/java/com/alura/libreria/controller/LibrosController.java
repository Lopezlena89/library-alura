package com.alura.libreria.controller;

import com.alura.libreria.dto.LibrosDTO;
import com.alura.libreria.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibrosController {
    @Autowired
    private LibrosService servicioLibros;

    @GetMapping()
    public List<LibrosDTO> obtenerLibros(){ // El servicio 'LibroService' devuelve una lista de 'LibrosDTO' que se envía de vuelta en formato JSON.
        return servicioLibros.obtenerLibros();
    }
}