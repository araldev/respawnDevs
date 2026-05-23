package com.example.RespawnDevs.Service;

import org.springframework.stereotype.Service;

import com.example.RespawnDevs.Repositorios.PlatoRepository;
import com.example.RespawnDevs.Entidades.Plato;

import java.util.List;
import java.util.Optional;

@Service
public class PlatoService {
    private final PlatoRepository platoRepository;

    public PlatoService(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    public List<Plato> getAllPlatos() {
        return platoRepository.findAll();
    }

    public Optional<Plato> getPlatoById(Long id) {
        return platoRepository.findById(id);
    }

    public Plato savePlato(Plato plato) {
        return platoRepository.save(plato);
    }

    public boolean existsById(Long id) {
        return platoRepository.findById(id).isPresent();
    }

    public Plato deletePlato(Long id) {
        Optional<Plato> platoOptional = platoRepository.findById(id);

        if (platoOptional.isPresent()) {
            platoRepository.deleteById(id);
            return platoOptional.get();
        }

        return null;
    }

    public Plato deleteReceta(Long id) {
        return deletePlato(id);
    }
}
