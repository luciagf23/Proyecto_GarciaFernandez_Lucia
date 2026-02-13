package com.luisdbb.tarea3AD2024base.modelo;

import java.util.List;

public class TutorEmpresa extends User {

	private Empresa empresa;
	private List<FormacionEmpresa> formaciones;

	public TutorEmpresa() {
		super();
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
