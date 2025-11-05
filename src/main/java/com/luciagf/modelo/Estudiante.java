package com.luciagf.modelo;

import java.util.List;

public class Estudiante extends Usuario{
	
	private String curso;
	private Grupo grupo;
	private List<FormacionEmpresa> formaciones;
	
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(int idUsuario, String nombre, String apellido, String email, String usuario, String contraseña,
			RolUsuario rol) {
		super(idUsuario, nombre, apellido, email, usuario, contraseña, rol);
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
