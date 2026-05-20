package com.example.demo.repositories;

import com.example.demo.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
//Para no tener que escribir ni una sola línea de código SQL a mano para las operaciones básicas creamos 
//los repositorios para ayudarnos.
public interface AutorRepository extends JpaRepository<Autor, Long> {
}