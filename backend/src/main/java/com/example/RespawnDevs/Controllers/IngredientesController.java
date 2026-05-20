package com.example.RespawnDevs.Controllers;

import com.example.RespawnDevs.Entidades.Ingredientes;
import com.example.RespawnDevs.Service.IngredientesService;

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
@RequestMapping("/ingredientes")
@CrossOrigin(origins = "*")
public class IngredientesController {

    private final IngredientesService ingredientesService;

    public IngredientesController(IngredientesService ingredientesService) {
        this.ingredientesService = ingredientesService;
    }

    @GetMapping
    public List<Ingredientes> obtenerTodos() {
        return ingredientesService.getAllIngredientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingredientes> obtenerPorId(@PathVariable Long id) {

        return ingredientesService.getIngredienteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Ingredientes> crear(@RequestBody Ingredientes ingrediente) {

        Ingredientes guardado = ingredientesService.saveIngrediente(ingrediente);
        return ResponseEntity.status(201).body(guardado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {

        if (!ingredientesService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        ingredientesService.deleteIngrediente(id);
        return ResponseEntity.noContent().build();
    }
}