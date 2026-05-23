package com.example.RespawnDevs.Service;

import com.example.RespawnDevs.Repositorios.AlergenoRepository;
import com.example.RespawnDevs.Entidades.Alergeno;

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
        return alergenoRepository.findAlergenosByRecetaId(recetaId);
    }

    public Alergeno saveAlergeno(Alergeno alergeno) {
        return alergenoRepository.save(alergeno);
    }

    public boolean existsById(Long id) {
        return alergenoRepository.existsById(id);
    }

    public Alergeno deleteAlergeno(Long id) {
        Optional<Alergeno> alergeno = alergenoRepository.findById(id);
        if (alergeno.isPresent()) {
            alergenoRepository.deleteById(id);
            return alergeno.get();
        }
        else {
            return null;
        }
    }
}
