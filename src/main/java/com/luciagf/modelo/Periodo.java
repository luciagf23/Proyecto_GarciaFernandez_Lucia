package com.luciagf.modelo;

import java.util.Date;

public class Periodo {

	private int idPeriodo;
	private String tipo;
	private String cursoAcademico;
	private Date fechaInicio;
	private Date fechaFin;
	
	
	
	
	public Periodo() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Periodo(int idPeriodo, String tipo, String cursoAcademico, Date fechaInicio, Date fechaFin) {
		super();
		this.idPeriodo = idPeriodo;
		this.tipo = tipo;
		this.cursoAcademico = cursoAcademico;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
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
	
	
	
}
