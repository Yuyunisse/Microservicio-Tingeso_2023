package com.example.pagoservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Pagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    private Long id;
    private String rut;
    private Date fecha_pago;
    private Date fecha_vencimiento;
    private Double monto;
    private Integer estado_pago;
    private Integer cant_cuotas;
    private Integer cuota_actual;
}
