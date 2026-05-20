package com.example.RespawnDevs.Entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "receta")
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "nombre")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "url_imagen")
    private String urlImagen;

    @OneToMany(mappedBy = "receta", cascade = CascadeType.ALL)
    private List<RecetaIngrediente> ingrediente;

    // Constructor vacío obligatorio para JPA
    public Receta() {
    }

    // --- GETTERS Y SETTERS ---

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

  
    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public List<RecetaIngrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<RecetaIngrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }
}