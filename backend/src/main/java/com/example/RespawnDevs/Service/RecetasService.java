package com.example.RespawnDevs.Service;

import org.springframework.stereotype.Service;

import com.example.RespawnDevs.Repositorios.RecetaRepository;
import com.example.RespawnDevs.Entidades.Recetas;

import java.util.List;
import java.util.Optional;

@Service
public class RecetasService {
    // -----------------------------------
    // Atributos
    // -----------------------------------

    private final RecetaRepository recetaRepository;

    // -----------------------------------
    // Constructores
    // -----------------------------------

    public RecetasService(RecetaRepository recetaRepository) {
        this.recetaRepository = recetaRepository;
    }

    // -----------------------------------
    // Métodos
    // -----------------------------------

    public List<Recetas> getAllRecetas() {
        return recetaRepository.findAll();
    }

    public Optional<Recetas> getRecetaById(Long id) {
        return recetaRepository.findById(id);
    }

    public Recetas saveReceta(Recetas receta) {
        return recetaRepository.save(receta);
    }

    public boolean existsById(Long id) {
        return recetaRepository.findById(id).isPresent();
    }

    public Recetas deleteReceta(Long id) {
        Optional<Recetas> recetaOptional = recetaRepository.findById(id);

        if (recetaOptional.isPresent()) {
            recetaRepository.deleteById(id);
            return recetaOptional.get();
        }

        return null;
    }
}
