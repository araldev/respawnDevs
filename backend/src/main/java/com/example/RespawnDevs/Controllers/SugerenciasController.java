package com.example.RespawnDevs.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RespawnDevs.Entidades.PlatoSugerido;
import com.example.RespawnDevs.Service.PlatoSugeridoService;

@RestController
@RequestMapping("/sugerencias")
@CrossOrigin(origins = "*")
public class SugerenciasController {

    private final PlatoSugeridoService service;

    public SugerenciasController(PlatoSugeridoService service) {
        this.service = service;
    }

    @GetMapping
    public List<PlatoSugerido> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlatoSugerido> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PlatoSugerido> create(@RequestBody PlatoSugerido plato) {
        PlatoSugerido saved = service.save(plato);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.deleteById(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
