package com.example.RespawnDevs.Controllers;

import com.example.RespawnDevs.Entidades.Ingredientes;
import com.example.RespawnDevs.Service.IngredientesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredientes")
@CrossOrigin(origins = "*")
public class IngredientesController {

    private final IngredientesService ingredientesService;

    public java.util.List<Ingredientes> getIngredientes() {
        return ingredientesService.getAllIngredientes();
    }

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
    public Ingredientes crear(@RequestBody Ingredientes ingrediente) {
        return ingredientesService.saveIngrediente(ingrediente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        ingredientesService.deleteIngrediente(id);
        return ResponseEntity.noContent().build();
    }
}