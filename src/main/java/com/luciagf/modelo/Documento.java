package com.luciagf.modelo;

import java.util.Date;

public class Documento {

	private int idDocumento;
	private String nombreArchivo;
	private String tipo;
	private Date fechaSubida;
	private Usuario subidaPor;
	private String ruta;
	
	
	
	
	public Documento() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Documento(int idDocumento, String nombreArchivo, String tipo, Date fechaSubida, Usuario subidaPor,
			String ruta) {
		super();
		this.idDocumento = idDocumento;
		this.nombreArchivo = nombreArchivo;
		this.tipo = tipo;
		this.fechaSubida = fechaSubida;
		this.subidaPor = subidaPor;
		this.ruta = ruta;
	}




	public int getIdDocumento() {
		return idDocumento;
	}




	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}




	public String getNombreArchivo() {
		return nombreArchivo;
	}




	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	public Date getFechaSubida() {
		return fechaSubida;
	}




	public void setFechaSubida(Date fechaSubida) {
		this.fechaSubida = fechaSubida;
	}




	public Usuario getSubidaPor() {
		return subidaPor;
	}




	public void setSubidaPor(Usuario subidaPor) {
		this.subidaPor = subidaPor;
	}




	public String getRuta() {
		return ruta;
	}




	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	
	
	
}
