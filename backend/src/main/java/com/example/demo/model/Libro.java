package com.example.demo.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private LocalDate fecha;
    private String ismn;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    @JsonIgnore
    private Autor autor;

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
    public LocalDate getFecha() { 
        return fecha; 
    }
    public void setFecha(LocalDate fecha) { 
        this.fecha = fecha; 
    }
    public String getIsmn() { 
        return ismn; 
    }
    public void setIsmn(String ismn) { 
        this.ismn = ismn; 
    }
    public Autor getAutor() { 
        return autor; 
    }
    public void setAutor(Autor autor) { 
        this.autor = autor; 
    }
}