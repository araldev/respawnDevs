package com.example.RespawnDevs.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "ingrediente_alergenos")
public class IngredienteAlergeno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ingrediente_id")
    @JsonIgnore
    private Ingredientes ingrediente;

    @ManyToOne
    @JoinColumn(name = "alergeno_id")
    private Alergeno alergeno;

    @Column(name = "es_traza")
    private Boolean esTraza = false;

    public IngredienteAlergeno() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ingredientes getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Alergeno getAlergeno() {
        return alergeno;
    }

    public void setAlergeno(Alergeno alergeno) {
        this.alergeno = alergeno;
    }

    public Boolean getEsTraza() {
        return esTraza;
    }

    public void setEsTraza(Boolean esTraza) {
        this.esTraza = esTraza;
    }
}
