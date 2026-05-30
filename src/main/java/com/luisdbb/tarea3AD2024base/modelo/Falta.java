package com.luisdbb.tarea3AD2024base.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Falta {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate fecha;

    private String motivo;

    private boolean justificada;

    @ManyToOne
    private FormacionEmpresa formacionEmpresa;
}
