package com.example.examenservice.controller;

import com.example.examenservice.entities.ExamenEntity;
import com.example.examenservice.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/examenes")
public class ExamenController {

    @Autowired
    ExamenService examenService;

    @GetMapping("/todo")
    public ResponseEntity<List<ExamenEntity>> getAll() {
        List<ExamenEntity> examenes = examenService.getAll();
        if (examenes.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(examenes);
    }

    //Listar todos los examenes de un alumno
    @GetMapping("/byrut/{rut}")
    public ResponseEntity<List<ExamenEntity>> getExamenAlumno(@PathVariable("rut") String rut){
        List<ExamenEntity> examenesAlumno =  examenService.getExamenesByRut(rut);
        if (examenesAlumno.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(examenesAlumno);
    }

    @GetMapping("/byfecha/{fecha}")
    public ResponseEntity<List<ExamenEntity>> getExamenesFecha(@PathVariable("fecha") Date fecha){
        List<ExamenEntity> examenesFecha = examenService.getExamenesByFecha(fecha);
        if (examenesFecha.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(examenesFecha);

    }

    //Los mapping de aqui son excel importados  :(((



}
