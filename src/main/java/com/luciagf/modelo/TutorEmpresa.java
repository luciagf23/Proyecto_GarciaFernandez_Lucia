package com.luciagf.modelo;

import java.util.List;

public class TutorEmpresa extends Usuario {

	private Empresa empresa;
	private List<FormacionEmpresa> formaciones;

	public TutorEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TutorEmpresa(int idUsuario, String nombre, String apellido, String email, String usuario, String contraseña,
			RolUsuario rol) {
		super(idUsuario, nombre, apellido, email, usuario, contraseña, rol);
		// TODO Auto-generated constructor stub
	}

	public TutorEmpresa(Empresa empresa, List<FormacionEmpresa> formaciones) {
		super();
		this.empresa = empresa;
		this.formaciones = formaciones;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<FormacionEmpresa> getFormaciones() {
		return formaciones;
	}

	public void setFormaciones(List<FormacionEmpresa> formaciones) {
		this.formaciones = formaciones;
	}

}
