package com.example.pagoservice.repositories;

import com.example.pagoservice.entities.PagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<PagoEntity, Long> {



        //buscar por rut
        List<PagoEntity> findAllByRut(String rut);

}
