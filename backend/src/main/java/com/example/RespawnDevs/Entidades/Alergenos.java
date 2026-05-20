package com.example.RespawnDevs.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "alergenos")
public class Alergenos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100, name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;

    public Alergenos() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}