package com.example.alumnoservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pago {
    private String rut;
    private Date fecha_pago;
    private Date fecha_vencimiento;
    private Double monto;
    private Integer estado_pago;
    private Integer cant_cuotas;
    private Integer cuota_actual;
}
