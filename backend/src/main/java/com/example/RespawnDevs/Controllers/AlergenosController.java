package com.example.RespawnDevs.Controllers;

import com.example.RespawnDevs.Entidades.Alergenos;
import com.example.RespawnDevs.Service.AlergenosService;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alergenos")
@CrossOrigin(origins = "*")
public class AlergenosController {

    private final AlergenosService alergenosService;

    public AlergenosController(AlergenosService alergenosService) {
        this.alergenosService = alergenosService;
    }

    @GetMapping
    public List<Alergenos> obtenerTodos() {
        return alergenosService.getAllAlergenos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alergenos> obtenerPorId(@PathVariable Long id) {
        return alergenosService.getAlergenoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Alergenos> crear(@Valid @RequestBody Alergenos alergeno) {
        Alergenos guardado = alergenosService.saveAlergeno(alergeno);
        return ResponseEntity.status(201).body(guardado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {

        if (!alergenosService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        alergenosService.deleteAlergeno(id);
        return ResponseEntity.noContent().build();
    }
}