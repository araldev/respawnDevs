package com.example.RespawnDevs.Controllers;

import com.example.RespawnDevs.Entidades.Alergenos;
import com.example.RespawnDevs.Service.AlergenoService;

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

@RestController
@RequestMapping("/alergenos")
@CrossOrigin(origins = "*")
public class AlergenosController {

    private final AlergenoService alergenoService;

    public AlergenosController(AlergenoService alergenoService) {
        this.alergenoService = alergenoService;
    }

    @GetMapping
    public List<Alergenos> obtenerTodos() {
        return alergenoService.getAllAlergenos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alergenos> obtenerPorId(@PathVariable Long id) {

        return alergenoService.getAlergenoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Alergenos> crear(@RequestBody Alergenos alergeno) {

        Alergenos guardado = alergenoService.saveAlergeno(alergeno);
        return ResponseEntity.status(201).body(guardado);
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