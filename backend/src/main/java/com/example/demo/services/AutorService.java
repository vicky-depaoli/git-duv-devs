package com.example.demo.services;

import com.example.demo.model.Autor;
import com.example.demo.repositories.AutorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> getAll() { return autorRepository.findAll(); }
    public Autor getById(Long id) { return autorRepository.findById(id).orElse(null); }
    public Autor save(Autor autor) { return autorRepository.save(autor); }
    public void delete(Long id) { autorRepository.deleteById(id); }
}