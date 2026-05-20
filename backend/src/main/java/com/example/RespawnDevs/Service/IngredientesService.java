package com.example.RespawnDevs.Service;

import com.example.RespawnDevs.Repositorios.IngredienteRepository;
import com.example.RespawnDevs.Entidades.Ingredientes;

import java.util.List;
import java.util.Optional;

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

    public List<Ingredientes> getAllIngredientes() {
        return ingredienteRepository.findAll();
    }

    public Optional<Ingredientes> getIngredienteById(Long id) {
        return ingredienteRepository.findById(id);
    }

    public List<Ingredientes> getIngredientesByRecetaId(Long recetaId) {
        return ingredienteRepository.findIngredientesByRecetaId(recetaId);
    }

    public Ingredientes saveIngrediente(Ingredientes ingrediente) {
        return ingredienteRepository.save(ingrediente);
    }

    public boolean existsById(Long id) {
        return ingredienteRepository.findById(id).isPresent();
    }

    public Ingredientes deleteIngrediente(Long id) {
        Optional<Ingredientes> ingredienteOptional = ingredienteRepository.findById(id);

        if (ingredienteOptional.isPresent()) {
            ingredienteRepository.deleteById(id);
            return ingredienteOptional.get();
        }

        return null;
    }
}
