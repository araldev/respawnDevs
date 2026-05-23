package com.example.RespawnDevs.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "receta_ingredientes")
public class RecetaIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "receta_id")
    @JsonIgnore
    private Plato receta;

    @ManyToOne
    @JoinColumn(name = "ingrediente_id")
    private Ingredientes ingrediente;

    @Column(name = "cantidad")
    private String cantidad;

    public RecetaIngrediente() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Plato getReceta() { return receta; }
    public void setReceta(Plato receta) { this.receta = receta; }

    public Ingredientes getIngrediente() { return ingrediente; }
    public void setIngrediente(Ingredientes ingrediente) { this.ingrediente = ingrediente; }

    public String getCantidad() { return cantidad; }
    public void setCantidad(String cantidad) { this.cantidad = cantidad; }
}
