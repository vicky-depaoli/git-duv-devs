package com.example.demo.controllers;

import com.example.demo.models.Libro;
import com.example.demo.services.LibroService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/libros")
@CrossOrigin(origins = "http://localhost:4200")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping
    public List<Libro> getAll() { 
        return libroService.getAll();
    }

    @GetMapping("/{id}")
    public Libro getById(@PathVariable Long id) { 
        return libroService.getById(id); 
    }

    @PostMapping
    public Libro create(@RequestBody Libro libro) { 
        return libroService.save(libro); 
    }

    @PutMapping("/{id}")
    public Libro update(@PathVariable Long id, @RequestBody Libro libro) {
        libro.setId(id);
        return libroService.save(libro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { 
        libroService.delete(id); 
    }
}