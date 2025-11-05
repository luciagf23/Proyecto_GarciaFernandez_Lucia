package com.luciagf.modelo;

import java.util.List;

public class Modulo {

	private int idModulo;
	private String nombre;
	private Profesor profesor;
	private List<String>resultadosAprendizaje;
	
	
	public Modulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Modulo(int idModulo, String nombre, Profesor profesor, List<String> resultadosAprendizaje) {
		super();
		this.idModulo = idModulo;
		this.nombre = nombre;
		this.profesor = profesor;
		this.resultadosAprendizaje = resultadosAprendizaje;
	}
	public int getIdModulo() {
		return idModulo;
	}
	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public List<String> getResultadosAprendizaje() {
		return resultadosAprendizaje;
	}
	public void setResultadosAprendizaje(List<String> resultadosAprendizaje) {
		this.resultadosAprendizaje = resultadosAprendizaje;
	}
	
	
}
