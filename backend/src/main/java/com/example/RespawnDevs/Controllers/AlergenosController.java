package com.example.RespawnDevs.Controllers;

import com.example.RespawnDevs.Entidades.Alergenos;
import com.example.RespawnDevs.Service.AlergenosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alergenos")
@CrossOrigin(origins = "*") // Permite que Angular se conecte sin errores de CORS
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
}