package com.luisdbb.tarea3AD2024base.modelo;

import java.util.Date;
import java.util.List;

public class Periodo {

	private int idPeriodo;
	private String tipo;
	private String cursoAcademico;
	private Date fechaInicio;
	private Date fechaFin;
	private List<FormacionEmpresa> formaciones;

	public Periodo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Periodo(int idPeriodo, String tipo, String cursoAcademico, Date fechaInicio, Date fechaFin,
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCursoAcademico() {
		return cursoAcademico;
	}

	public void setCursoAcademico(String cursoAcademico) {
		this.cursoAcademico = cursoAcademico;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<FormacionEmpresa> getFormaciones() {
		return formaciones;
	}

	public void setFormaciones(List<FormacionEmpresa> formaciones) {
		this.formaciones = formaciones;
	}

}