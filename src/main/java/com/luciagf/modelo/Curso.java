package com.luciagf.modelo;

import java.util.List;

public class Curso {

	private int idCurso;
	private String  nombre;
	private String anioAcademico;
	private List<Modulo>modulos;
	private List<Estudiante>estudiantes;
	private List<Profesor>profesores;
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(int idCurso, String nombre, String anioAcademico, List<Modulo> modulos, List<Estudiante> estudiantes,
			List<Profesor> profesores) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.anioAcademico = anioAcademico;
		this.modulos = modulos;
		this.estudiantes = estudiantes;
		this.profesores = profesores;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAnioAcademico() {
		return anioAcademico;
	}

	public void setAnioAcademico(String anioAcademico) {
		this.anioAcademico = anioAcademico;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}
	
	
	
	
}
