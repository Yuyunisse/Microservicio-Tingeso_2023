package com.example.alumnoservice.alumnoControllers;

import com.example.alumnoservice.alumnoEntity.AlumnoEntity;
import com.example.alumnoservice.alumnoService.AlumnoService;
import com.example.alumnoservice.models.Examen;
import com.example.alumnoservice.models.Pago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    //
    @GetMapping("/todos")
    public ResponseEntity<List<AlumnoEntity>> getAll() {
        List<AlumnoEntity> alumnos = alumnoService.getAll();
        if (alumnos.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(alumnos);
    }

    //Listar por rut
    @GetMapping("alumno/{rutalumno}")
    public ResponseEntity<AlumnoEntity> getbyRut(@PathVariable("rutalumno") String rut){
        AlumnoEntity alumno = alumnoService.findAlumnoByRut(rut);
        if (alumno == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(alumno);
    }

    //Listar los examenes de un alumno
    @GetMapping("/examenes/{rut}")
    public ResponseEntity<List<Examen>> getExamen(@PathVariable("rut") String rut) {
        AlumnoEntity alumno = alumnoService.findAlumnoByRut(rut);
        if (alumno == null)
            return ResponseEntity.notFound().build();
        List<Examen> examenAlumno = alumnoService.getExamenesAlumno(rut);
        return ResponseEntity.ok(examenAlumno);
    }

    @GetMapping("/examenes/{fecha}")
    public ResponseEntity<List<Examen>> getExamenFecha(@PathVariable("fecha") Date fecha){
        List<Examen> examen = alumnoService.getExamenesByFecha(fecha);
        if (examen.isEmpty())
            return ResponseEntity.notFound().build();
        List<Examen> examensFecha = alumnoService.getExamenesByFecha(fecha);
        return ResponseEntity.ok(examensFecha);
    }

    @GetMapping("pagos/{rut}")
    public ResponseEntity<List<Pago>> getPagosAlumno(@PathVariable ("rut") String rut){
        List<Pago> pagosAlumno = alumnoService.getPagosByRut(rut);
        if (pagosAlumno.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(pagosAlumno);
    }

    @PostMapping()
    public ResponseEntity<AlumnoEntity> guardar(@RequestBody AlumnoEntity alumno){
        AlumnoEntity alumnonuevo = alumnoService.guardarAlumno(alumno);
        return ResponseEntity.ok(alumnonuevo);
    }





    //Los post de examen segun se basan en la escritura de archivo
}

