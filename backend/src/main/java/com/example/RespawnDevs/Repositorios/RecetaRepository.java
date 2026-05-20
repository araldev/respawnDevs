package com.example.RespawnDevs.Repositorios;

import com.example.RespawnDevs.Entidades.Recetas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Long> {
   }