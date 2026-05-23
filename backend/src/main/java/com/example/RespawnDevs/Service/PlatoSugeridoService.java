package com.example.RespawnDevs.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.RespawnDevs.Entidades.PlatoSugerido;

@Service
public class PlatoSugeridoService {

    private final List<PlatoSugerido> sugerencias = new CopyOnWriteArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public List<PlatoSugerido> getAll() {
        return List.copyOf(sugerencias);
    }

    public PlatoSugerido save(PlatoSugerido plato) {
        plato.setId(idCounter.getAndIncrement());
        sugerencias.add(plato);
        return plato;
    }

    public Optional<PlatoSugerido> getById(Long id) {
        return sugerencias.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();
    }

    public boolean deleteById(Long id) {
        return sugerencias.removeIf(s -> s.getId().equals(id));
    }
}
