package com.example.RespawnDevs.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RespawnDevs.Service.RecetasService;
import com.example.RespawnDevs.Entidades.Recetas;

@RestController
@RequestMapping("/recetas")
@CrossOrigin(origins = "*")
public class RecetasController {

    private final RecetasService recetasService;

    public RecetasController(RecetasService recetasService) {
        this.recetasService = recetasService;
    }

    @GetMapping
    public List<Recetas> obtenerTodo() {
        return recetasService.getAllRecetas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recetas> obtenerPorId(@PathVariable Long id) {
        Optional<Recetas> receta = recetasService.getRecetaById(id);

        if (receta.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(receta.get());
    }

    @PostMapping
    public ResponseEntity<Recetas> crear(@RequestBody Recetas receta) {
        Recetas guardada = recetasService.saveReceta(receta);
        return ResponseEntity.ok(guardada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {

        if (!recetasService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        recetasService.deleteReceta(id);
        return ResponseEntity.noContent().build();
    }
}