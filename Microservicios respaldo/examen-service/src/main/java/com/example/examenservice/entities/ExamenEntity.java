package com.example.examenservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Examenes")
@NoArgsConstructor
@AllArgsConstructor
public class ExamenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false)
    private Long id;
    private String rut;
    private Date rendicion;
    private Integer puntaje;

}
