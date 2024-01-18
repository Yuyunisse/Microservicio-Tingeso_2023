package com.example.alumnoservice.alumnoRepositories;

import com.example.alumnoservice.alumnoEntity.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlumnoRepository extends JpaRepository<AlumnoEntity, String> {
    AlumnoEntity findByRut(String rut);

    List<AlumnoEntity> findAllByRut(String rut);
}
