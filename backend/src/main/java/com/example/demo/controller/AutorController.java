package com.example.demo.controller;

import com.example.demo.model.Autor;
import com.example.demo.model.Libro;
import com.example.demo.services.AutorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

//Controladores para manipular conexiones al sistema.
@RestController
@RequestMapping("/api/autores")
@CrossOrigin(origins = "http://localhost:4200")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public List<Autor> getAll() { 
        return autorService.getAll(); 
    }

    @GetMapping("/{id}")
    public Autor getById(@PathVariable Long id) { 
        return autorService.getById(id);
    }

    @PostMapping
    public Autor create(@RequestBody Autor autor) { 
        return autorService.save(autor); 
    }

    @PutMapping("/{id}")
    public Autor update(@PathVariable Long id, @RequestBody Autor autor) {
        autor.setId(id);
        return autorService.save(autor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { 
        autorService.delete(id); 
    }
    @GetMapping("/{id}/books")
    public List<Libro> getBooksByAuthor(@PathVariable Long id) {
        return autorService.getBooksByAuthor(id);
    }
    

}