package com.example.alumnoservice.alumnoEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "Alumnos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoEntity {

    @Id
    private String rut;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private Date nacimiento; //"año-mes-dia"
    private String colegio;
    private String tipoColegio;
    private Integer egreso;
    private Integer cuotas;
}


