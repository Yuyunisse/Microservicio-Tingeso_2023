package com.example.examenservice.repositories;

import com.example.examenservice.entities.ExamenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ExamenRepository extends JpaRepository<ExamenEntity, Long> {

    //Buscar por rut
    List<ExamenEntity> findByRut(String rut);

    //Buscar todos los examenes por rut
    List<ExamenEntity> findAllByrut(String rut);

    //Buscar todos los examenes por fecha
    List<ExamenEntity> findAllByRendicion(Date rendicion);

}

