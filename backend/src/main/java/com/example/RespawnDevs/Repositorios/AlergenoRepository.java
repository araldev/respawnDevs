package com.example.RespawnDevs.Repositorios;

import com.example.RespawnDevs.Entidades.Alergenos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface AlergenoRepository extends JpaRepository<Alergenos, Long> {
}