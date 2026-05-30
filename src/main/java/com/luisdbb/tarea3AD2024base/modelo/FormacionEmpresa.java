package com.luisdbb.tarea3AD2024base.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class FormacionEmpresa {


	@Id
	@GeneratedValue
	private int idFormacion;
	
	@ManyToOne
	private Estudiante estudiante;
	
	@ManyToOne
	private Empresa empresa;
	
	@ManyToOne
	private TutorEmpresa tutorEmpresa;
	@ManyToOne
	private Profesor profesorCoordinador;
	
	@ManyToOne
	private Periodo periodo;
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	@OneToMany(mappedBy = "FormacionEmpresa")
	private List<Documento> documentos;

	public int getIdFormacion() {
		return idFormacion;
	}

	public void setIdFormacion(int idFormacion) {
		this.idFormacion = idFormacion;
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

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
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

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	
	
	

}