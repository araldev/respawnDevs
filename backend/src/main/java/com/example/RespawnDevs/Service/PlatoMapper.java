package com.example.RespawnDevs.Service;

import com.example.RespawnDevs.Entidades.Alergeno;
import com.example.RespawnDevs.Entidades.Plato;

import java.util.List;
import java.util.stream.Collectors;

public class PlatoMapper {
    private PlatoMapper() {
    }

    public static Plato fromPlato(Plato receta, List<Alergeno> alergenos) {
        List<Alergeno> alergenosDto = alergenos.stream()
                .map(alergeno -> new Alergeno(alergeno.getId(), alergeno.getNombre(), alergeno.getDescripcion()))
                .collect(Collectors.toList());

        Plato plato = new Plato(
                receta.getId(),
                receta.getNombre(),
                receta.getDescripcion(),
                receta.getInstrucciones(),
                receta.getUrlImagen(),
                receta.getPrecio(),
                receta.getValoracion(),
                alergenosDto);
        plato.setIngredientes(receta.getIngredientes());
        return plato;
    }
}
