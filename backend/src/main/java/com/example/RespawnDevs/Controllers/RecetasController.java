package com.example.RespawnDevs.Controllers;

import com.example.RespawnDevs.Entidades.Recetas;
import com.example.RespawnDevs.Service.RecetasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recetas")
@CrossOrigin(origins = "*")
public class RecetasController {

    private final RecetasService recetasService;

    public RecetasController(RecetasService recetasService) {
        this.recetasService = recetasService;
    }

    @GetMapping
    public List<Recetas> obtenerTodas() {
        return recetasService.getAllRecetas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recetas> obtenerPorId(@PathVariable Long id) {
        return recetasService.getRecetaById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Recetas crear(@RequestBody Recetas receta) {
        return recetasService.saveReceta(receta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        recetasService.deleteReceta(id);
        return ResponseEntity.noContent().build();
    }
}