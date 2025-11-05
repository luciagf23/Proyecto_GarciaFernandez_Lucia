package com.luciagf.modelo;

import java.util.List;

public class Profesor extends Usuario{

	private String curso;
	private List<Grupo> grupos;
	
	private List<FormacionEmpresa>formaciones;

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(int idUsuario, String nombre, String apellido, String email, String usuario, String contraseña,
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



	public List<FormacionEmpresa> getFormaciones() {
		return formaciones;
	}

	public void setFormaciones(List<FormacionEmpresa> formaciones) {
		this.formaciones = formaciones;
	}
	
	
	
}
