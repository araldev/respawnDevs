package com.example.RespawnDevs.Service;

import org.springframework.stereotype.Service;

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

    public List<Receta> getAllRecetas() {
        return recetaRepository.findAll();
    }

    public Optional<Receta> getRecetaById(Long id) {
        return recetaRepository.findById(id);
    }
}
