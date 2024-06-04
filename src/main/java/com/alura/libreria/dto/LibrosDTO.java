package com.alura.libreria.dto;

import com.alura.libreria.model.Autores;

public record LibrosDTO (Long Id, String titulo, Autores autor, String idioma, Double descargas) {

}