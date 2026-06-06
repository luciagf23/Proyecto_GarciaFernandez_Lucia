package com.luisdbb.tarea3AD2024base.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpresa;

	private String nombre;
	private String direccion;
	private String telefono;
	private String email;

	@OneToMany(mappedBy = "empresa")
	private List<TutorEmpresa> tutores = new ArrayList<>();

	@OneToMany(mappedBy = "empresa")
	private List<FormacionEmpresa> formaciones = new ArrayList<>();

	public Empresa() {
	}

	public Empresa(int idEmpresa, String nombre, String direccion, String telefono, String email,
			List<TutorEmpresa> tutores, List<FormacionEmpresa> formaciones) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.tutores = tutores;
		this.formaciones = formaciones;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<TutorEmpresa> getTutores() {
		return tutores;
	}

	public void setTutores(List<TutorEmpresa> tutores) {
		this.tutores = tutores;
	}

	public List<FormacionEmpresa> getFormaciones() {
		return formaciones;
	}

	public void setFormaciones(List<FormacionEmpresa> formaciones) {
		this.formaciones = formaciones;
	}

}
