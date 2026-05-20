package com.example.RespawnDevs.Service;

import com.example.RespawnDevs.Repositorios.AlergenoRepository;
import com.example.RespawnDevs.Entidades.Alergenos;

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

    public List<Alergenos> getAllAlergenos() {
        return alergenoRepository.findAll();
    }

    public Optional<Alergenos> getAlergenoById(Long id) {
        return alergenoRepository.findById(id);
    }

    public List<Alergenos> getAlergenosByRecetaId(Long recetaId) {
        return alergenoRepository.findAlergenosByRecetaId(recetaId);
    }
}
