package com.example.RespawnDevs.Service;

import org.springframework.stereotype.Service;

@Service
public class Ingredientes {
    // -----------------------------------
    // Atributos
    // -----------------------------------

    private final IngredienteRepository ingredienteRepository;

    // -----------------------------------
    // Constructores
    // -----------------------------------

    public Ingredientes(IngredienteRepository ingredienteRepository) {
        this.ingredienteRepository = ingredienteRepository;
    }

    // -----------------------------------
    // Métodos
    // -----------------------------------
}
