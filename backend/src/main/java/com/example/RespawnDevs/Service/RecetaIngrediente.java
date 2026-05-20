package com.example.RespawnDevs.Service;

import org.springframework.stereotype.Service;

@Service
public class RecetaIngrediente {
    // -----------------------------------
    // Atributos
    // -----------------------------------

    private final RecetaIngredienteRepository recetaIngredienteRepository;

    // -----------------------------------
    // Constructores
    // -----------------------------------

    public RecetaIngrediente(RecetaIngredienteRepository recetaIngredienteRepository) {
        this.recetaIngredienteRepository = recetaIngredienteRepository;
    }

    // -----------------------------------
    // Métodos
    // -----------------------------------
}
