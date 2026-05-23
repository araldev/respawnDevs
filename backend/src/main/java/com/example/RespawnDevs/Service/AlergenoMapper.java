package com.example.RespawnDevs.Service;

import com.example.RespawnDevs.Entidades.Alergeno;

public class AlergenoMapper {
    private AlergenoMapper() {
    }

    public static Alergeno fromEntity(Alergeno alergeno) {
        return new Alergeno(alergeno.getId(), alergeno.getNombre(), alergeno.getDescripcion());
    }
}
