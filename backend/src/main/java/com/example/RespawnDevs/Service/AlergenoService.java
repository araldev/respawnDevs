package com.example.RespawnDevs.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class AlergenoService {
    // -----------------------------------
    // Atributos
    // -----------------------------------

    private final AlergenoRepository alergenoRepository;

    // -----------------------------------
    // Constructores
    // -----------------------------------

    public AlergenoService(AlergenoRepository alergenoRepository) {
        this.alergenoRepository = alergenoRepository;
    }

    // -----------------------------------
    // Métodos
    // -----------------------------------

    public List<Alergeno> getAllAlergenos() {
        return alergenoRepository.findAll();
    }

    public Optional<Alergeno> getAlergenoById(Long id) {
        return alergenoRepository.findById(id);
    }

    public List<Alergeno> getAlergenosByRecetaId(Long recetaId) {
        return recetaRepository.findAlergenosByRecetaId(recetaId);
    }
}
