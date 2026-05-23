package com.example.RespawnDevs.Controllers;

import java.util.List;
import java.util.Optional;
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

import com.example.RespawnDevs.Service.PlatoService;
import com.example.RespawnDevs.Entidades.Plato;
import com.example.RespawnDevs.Service.AlergenoService;
import com.example.RespawnDevs.Service.PlatoMapper;

@RestController
@RequestMapping("/recetas")
@CrossOrigin(origins = "*")
public class RecetasController {

    private final PlatoService recetasService;
    private final AlergenoService alergenoService;

    public RecetasController(PlatoService recetasService, AlergenoService alergenoService) {
        this.recetasService = recetasService;
        this.alergenoService = alergenoService;
    }

    @GetMapping
    public List<Plato> obtenerTodo() {
        return recetasService.getAllPlatos().stream()
                .map(plato -> PlatoMapper.fromPlato(
                        plato,
                        alergenoService.getAlergenosByRecetaId(plato.getId())))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plato> obtenerPorId(@PathVariable Long id) {
        Optional<Plato> receta = recetasService.getPlatoById(id);

        if (receta.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(PlatoMapper.fromPlato(
                receta.get(),
                alergenoService.getAlergenosByRecetaId(receta.get().getId())));
    }

    @PostMapping
    public ResponseEntity<Plato> crear(@RequestBody Plato receta) {
        Plato guardada = recetasService.savePlato(receta);
        return ResponseEntity.ok(PlatoMapper.fromPlato(
                guardada,
                alergenoService.getAlergenosByRecetaId(guardada.getId())));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {

        if (!recetasService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        recetasService.deletePlato(id);
        return ResponseEntity.noContent().build();
    }
}
