package com.example.RespawnDevs.Repositorios;

import com.example.RespawnDevs.Entidades.Ingredientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredienteRepository extends JpaRepository<Ingredientes, Long> {
    @Query("""
        SELECT RecetaIngrediente.ingrediente
        FROM RecetaIngrediente
        WHERE RecetaIngrediente.receta.id = :recetaId
    """)
    List<Ingredientes> findIngredientesByRecetaId(@Param("recetaId") Long recetaId);
}