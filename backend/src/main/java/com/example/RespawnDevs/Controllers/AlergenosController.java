package com.example.RespawnDevs.Controllers;

import com.example.RespawnDevs.Entidades.Alergeno;
import com.example.RespawnDevs.Service.AlergenoService;
import com.example.RespawnDevs.Service.AlergenoMapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alergenos")
@CrossOrigin(origins = "*")
public class AlergenosController {

    private final AlergenoService alergenoService;

    public AlergenosController(AlergenoService alergenoService) {
        this.alergenoService = alergenoService;
    }

    @GetMapping
    public List<Alergeno> obtenerTodos() {
        return alergenoService.getAllAlergenos().stream()
                .map(AlergenoMapper::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alergeno> obtenerPorId(@PathVariable Long id) {

        return alergenoService.getAlergenoById(id)
                .map(AlergenoMapper::fromEntity)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Alergeno> crear(@RequestBody Alergeno alergeno) {

        Alergeno guardado = alergenoService.saveAlergeno(alergeno);
        return ResponseEntity.status(201).body(AlergenoMapper.fromEntity(guardado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {

        if (!alergenoService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        alergenoService.deleteAlergeno(id);
        return ResponseEntity.noContent().build();
    }
}
