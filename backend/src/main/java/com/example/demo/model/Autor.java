package com.example.demo.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private String dni;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Libro> libros;

    public int getCantidadLibros() {
        return libros != null ? libros.size() : 0;
    }

    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
        }
    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    public String getApellido() { 
        return apellido; 
    }
    public void setApellido(String apellido) { 
        this.apellido = apellido; 
    }
    public LocalDate getFecha_nacimiento() { 
        return fecha_nacimiento; 
    }
    public void setFecha_nacimiento(LocalDate fecha_nacimiento) { 
        this.fecha_nacimiento = fecha_nacimiento; 
    }
    public String getDni() { 
        return dni; 
    }
    public void setDni(String dni) { 
        this.dni = dni; 
    }
    public List<Libro> getLibros() { 
        return libros;
    }
    public void setLibros(List<Libro> libros) { 
        this.libros = libros; 
    }
}