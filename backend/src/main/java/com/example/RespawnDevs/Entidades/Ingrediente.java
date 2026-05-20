package com.example.RespawnDevs.Entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ingrediente")
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "ingrediente")
    private List<IngredienteAlergeno> alergeno;

    public Ingredientes() {
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

    public List<IngredienteAlergeno> getAlergeno() {
        return alergeno;
    }

    public void setAlergenos(List<IngredienteAlergeno> alergeno) {
        this.alergeno = alergeno;
    }
}