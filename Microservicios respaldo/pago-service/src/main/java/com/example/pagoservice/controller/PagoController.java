package com.example.pagoservice.controller;

import com.example.pagoservice.entities.PagoEntity;
import com.example.pagoservice.services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    PagoService pagoService;

    //Muestra los datos de los pagos de un alumno
    @GetMapping("/pago/{rut}")
    public ResponseEntity<List<PagoEntity>> getPagosAlumno(@PathVariable("rut") String rut){
        List<PagoEntity> historialPago = pagoService.getHistorialAlumno(rut);
        if (historialPago.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(historialPago);
    }
}
