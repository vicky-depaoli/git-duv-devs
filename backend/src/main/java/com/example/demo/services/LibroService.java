package com.example.demo.services;

import com.example.demo.model.Libro;
import com.example.demo.repositories.LibroRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> getAll() { return libroRepository.findAll(); }
    public Libro getById(Long id) { return libroRepository.findById(id).orElse(null); }
    public Libro save(Libro libro) { return libroRepository.save(libro); }
    public void delete(Long id) { libroRepository.deleteById(id); }
}