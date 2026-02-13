package com.luisdbb.tarea3AD2024base.modelo;

import java.util.List;

public class Profesor extends User {

	private String curso;
	private List<Grupo> grupos;

	private List<FormacionEmpresa> formaciones;

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<FormacionEmpresa> getFormaciones() {
		return formaciones;
	}

	public void setFormaciones(List<FormacionEmpresa> formaciones) {
		this.formaciones = formaciones;
	}

}
