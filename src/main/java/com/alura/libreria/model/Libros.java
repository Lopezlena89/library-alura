package com.alura.libreria.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.OptionalDouble;

@Entity
@Table(name="libros")
public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String titulo;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id")
    private Autores autor;
    private String idioma;
    private Double descargas;

    public Libros() {
    }


    public Libros(String titulo, Autores autor, List<String> idiomas, Double descargas) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idiomas != null && !idiomas.isEmpty() ? String.join(",", idiomas) : null;
        this.descargas = OptionalDouble.of(descargas).orElse(0);
    }

    // Métodos Getter y Setter.
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Autores getAutor() {
        return autor;
    }
    public void setAutor(Autores autor) {
        this.autor = autor;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public Double getDescargas() {
        return descargas;
    }
    public void setDescargas(Double descargas) {
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return  "====== LIBRO ======" +"\n"+
                "Título: " + titulo +"\n"+
                "Autor: " + autor.getNombre() +"\n"+
                "Idioma: " + idioma +"\n"+
                "Número de descargas: " + descargas +"\n"+
                "--------------------" +"\n";
    }
}