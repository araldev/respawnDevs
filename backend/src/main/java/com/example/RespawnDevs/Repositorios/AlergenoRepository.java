package com.example.RespawnDevs.Repositorios;

import java.util.List;

import com.example.RespawnDevs.Entidades.Alergenos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface AlergenoRepository extends JpaRepository<Alergenos, Long> {
    @Query("""
        SELECT DISTINCT a
        FROM RecetaIngrediente ri
        JOIN ri.ingrediente i
        JOIN i.alergenos ia
        JOIN ia.alergeno a
        WHERE ri.receta.id = :recetaId
    """)
    List<Alergenos> findAlergenosByRecetaId(@Param("recetaId") Long recetaId);
}