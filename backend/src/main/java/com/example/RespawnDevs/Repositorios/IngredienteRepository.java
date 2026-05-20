package com.example.RespawnDevs.Repositorios;

import com.example.RespawnDevs.Entidades.Ingredientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface IngredienteRepository extends JpaRepository<Ingredientes, Long> {

    @Query("""
        SELECT ri.ingrediente
        FROM RecetaIngrediente ri
        WHERE ri.receta.id = :recetaId
    """)
    List<Ingredientes> findIngredientesByRecetaId(@Param("recetaId") Long recetaId);
}