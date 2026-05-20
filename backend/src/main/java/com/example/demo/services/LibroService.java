package com.example.demo.services;

import com.example.demo.model.Libro;
import com.example.demo.model.Autor;
import com.example.demo.repositories.LibroRepository;
import com.example.demo.repositories.AutorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {

    private final LibroRepository libroRepository;
    private final AutorRepository autorRepository;

    public LibroService(LibroRepository libroRepository, AutorRepository autorRepository) {
        this.libroRepository = libroRepository;
        this.autorRepository = autorRepository;
    }

    public List<Libro> getAll() { return libroRepository.findAll(); }
    
    public Libro getById(Long id) { return libroRepository.findById(id).orElse(null); }
    
    public Libro save(Libro libro) { return libroRepository.save(libro); }
    
    public Libro saveWithAutor(Libro libro, Long autorId) {
        Autor autor = autorRepository.findById(autorId).orElse(null);
        if (autor != null) {
            libro.setAutor(autor);
        }
        return libroRepository.save(libro);
    }
    
    public void delete(Long id) { libroRepository.deleteById(id); }
}