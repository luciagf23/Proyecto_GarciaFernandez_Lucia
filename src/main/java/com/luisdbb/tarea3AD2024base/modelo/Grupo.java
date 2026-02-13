package com.luisdbb.tarea3AD2024base.modelo;

import java.util.List;

public class Grupo {

	private int idGrupo;
	private String nombre;
	private String ciclo;
	private int curso;
	private String anioAcademico;
	private Profesor tutor;
	private List<Estudiante> estudiantes;

	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grupo(int idGrupo, String nombre, String ciclo, int curso, String anioAcademico, Profesor tutor,
			List<Estudiante> estudiantes) {
		super();
		this.idGrupo = idGrupo;
		this.nombre = nombre;
		this.ciclo = ciclo;
		this.curso = curso;
		this.anioAcademico = anioAcademico;
		this.tutor = tutor;
		this.estudiantes = estudiantes;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getAnioAcademico() {
		return anioAcademico;
	}

	public void setAnioAcademico(String anioAcademico) {
		this.anioAcademico = anioAcademico;
	}

	public Profesor getTutor() {
		return tutor;
	}

	public void setTutor(Profesor tutor) {
		this.tutor = tutor;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
