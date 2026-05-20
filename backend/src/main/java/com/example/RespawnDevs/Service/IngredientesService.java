package com.example.RespawnDevs.Service;

import org.springframework.stereotype.Service;

@Service
public class IngredientesService {
    // -----------------------------------
    // Atributos
    // -----------------------------------

    private final IngredienteRepository ingredienteRepository;

    // -----------------------------------
    // Constructores
    // -----------------------------------

    public IngredientesService(IngredienteRepository ingredienteRepository) {
        this.ingredienteRepository = ingredienteRepository;
    }

    // -----------------------------------
    // Métodos
    // -----------------------------------

    public List<Ingrediente> getAllIngredientes() {
        return ingredienteRepository.findAll();
    }

    public Optional<Ingrediente> getIngredienteById(Long id) {
        return ingredienteRepository.findById(id);
    }

    public List<Ingrediente> getIngredientesByRecetaId(Long recetaId) {
        return ingredienteRepository.findIngredientesByRecetaId(recetaId);
    }
}
