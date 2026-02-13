package com.luisdbb.tarea3AD2024base.modelo;

import java.util.List;

public class Estudiante extends User {

	private String curso;
	private Grupo grupo;
	private List<FormacionEmpresa> formaciones;

	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public List<FormacionEmpresa> getFormaciones() {
		return formaciones;
	}

	public void setFormaciones(List<FormacionEmpresa> formaciones) {
		this.formaciones = formaciones;
	}

}
