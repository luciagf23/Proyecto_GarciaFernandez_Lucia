package com.luisdbb.tarea3AD2024base.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Calificacion {

    @Id
    @GeneratedValue
    private Long id;

    private Double nota;

    private String observaciones;

    @OneToOne
    private FormacionEmpresa formacionEmpresa;
}
