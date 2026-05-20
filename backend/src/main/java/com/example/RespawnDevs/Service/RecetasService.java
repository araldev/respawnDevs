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
}
