package com.luisdbb.tarea3AD2024base.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "periodo")
public class Periodo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_periodo")
    private int idPeriodo;

    @Enumerated(EnumType.STRING)
    private TipoPeriodo tipo;

    private String cursoAcademico;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @OneToMany(mappedBy = "periodo")
    private List<FormacionEmpresa> formaciones;

    public Periodo() {}

	

	public Periodo(int idPeriodo, TipoPeriodo tipo, String cursoAcademico, LocalDate fechaInicio, LocalDate fechaFin,
			List<FormacionEmpresa> formaciones) {
		super();
		this.idPeriodo = idPeriodo;
		this.tipo = tipo;
		this.cursoAcademico = cursoAcademico;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.formaciones = formaciones;
	}



	public int getIdPeriodo() {
		return idPeriodo;
	}



	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}



	public TipoPeriodo getTipo() {
		return tipo;
	}



	public void setTipo(TipoPeriodo tipo) {
		this.tipo = tipo;
	}



	public String getCursoAcademico() {
		return cursoAcademico;
	}



	public void setCursoAcademico(String cursoAcademico) {
		this.cursoAcademico = cursoAcademico;
	}



	public LocalDate getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public LocalDate getFechaFin() {
		return fechaFin;
	}



	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}



	public List<FormacionEmpresa> getFormaciones() {
		return formaciones;
	}



	public void setFormaciones(List<FormacionEmpresa> formaciones) {
		this.formaciones = formaciones;
	}





}