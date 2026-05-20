package com.example.RespawnDevs.Service;

import org.springframework.stereotype.Service;

@Service
public class IngredienteAlergenoService {
    // -----------------------------------
    // Atributos
    // -----------------------------------

    private final IngredienteAlergenoRepository ingredienteAlergenoRepository;

    // -----------------------------------
    // Constructores
    // -----------------------------------

    public IngredienteAlergenoService(IngredienteAlergenoRepository ingredienteAlergenoRepository) {
        this.ingredienteAlergenoRepository = ingredienteAlergenoRepository;
    }

    // -----------------------------------
    // Métodos
    // -----------------------------------

    public List<IngredienteAlergeno> getAllIngredienteAlergenos() {
        return ingredienteAlergenoRepository.findAll();
    }

    public Optional<IngredienteAlergeno> getIngredienteAlergenoById(Long id) {
        return ingredienteAlergenoRepository.findById(id);
    }

    public List<IngredienteAlergeno> getIngredienteAlergenosByIngredienteId(Long ingredienteId) {
        return ingredienteAlergenoRepository.findByIngredienteId(ingredienteId);
    }
}
