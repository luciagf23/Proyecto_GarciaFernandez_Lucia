package com.luciagf.modelo;

import java.util.Date;
import java.util.List;

public class FormacionEmpresa {

	private int idFormacion;
	private Periodo periodo;
	private Date fechaInicio;
	private Date fechaFin;
	private Estudiante estudiante;
	private Empresa empresa;
	private TutorEmpresa tutorEmpresa;
	private Profesor profesorCoordinador;
	private List<Documento>documentos;
	
	
	public FormacionEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FormacionEmpresa(int idFormacion, Periodo periodo, Date fechaInicio, Date fechaFin, Estudiante estudiante,
			Empresa empresa, TutorEmpresa tutorEmpresa, Profesor profesorCoordinador, List<Documento> documentos) {
		super();
		this.idFormacion = idFormacion;
		this.periodo = periodo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estudiante = estudiante;
		this.empresa = empresa;
		this.tutorEmpresa = tutorEmpresa;
		this.profesorCoordinador = profesorCoordinador;
		this.documentos = documentos;
	}


	public int getIdFormacion() {
		return idFormacion;
	}


	public void setIdFormacion(int idFormacion) {
		this.idFormacion = idFormacion;
	}


	public Periodo getPeriodo() {
		return periodo;
	}


	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
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


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public TutorEmpresa getTutorEmpresa() {
		return tutorEmpresa;
	}


	public void setTutorEmpresa(TutorEmpresa tutorEmpresa) {
		this.tutorEmpresa = tutorEmpresa;
	}


	public Profesor getProfesorCoordinador() {
		return profesorCoordinador;
	}


	public void setProfesorCoordinador(Profesor profesorCoordinador) {
		this.profesorCoordinador = profesorCoordinador;
	}


	public List<Documento> getDocumentos() {
		return documentos;
	}


	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	
	
	
	
	
	
}
