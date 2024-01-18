package com.example.examenservice.services;

import com.example.examenservice.entities.ExamenEntity;
import com.example.examenservice.repositories.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ExamenService {

    @Autowired
    ExamenRepository examenRepository;

    public List<ExamenEntity> getAll() { return examenRepository.findAll();}
    public List<ExamenEntity> getExamenesByRut(String rut) { return examenRepository.findAllByrut(rut);}
    // public List<ExamenEntity> byAlumnoRut(String rut) {return examenRepository.findByRut(rut);}

    //Listar todos los examenes or fecha
    public List<ExamenEntity> getExamenesByFecha(Date fecha) { return examenRepository.findAllByRendicion(fecha); }

}
