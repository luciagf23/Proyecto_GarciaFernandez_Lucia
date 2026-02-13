package com.luisdbb.tarea3AD2024base.modelo;

import java.util.Date;

public class Documento {

	private int idDocumento;
	private String nombreArchivo;
	private String tipo;
	private Date fechaSubida;
	private String ruta;
	private User subidaPor;
	private FormacionEmpresa formacion;

	public Documento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Documento(int idDocumento, String nombreArchivo, String tipo, Date fechaSubida, String ruta,
			User subidaPor, FormacionEmpresa formacion) {
		super();
		this.idDocumento = idDocumento;
		this.nombreArchivo = nombreArchivo;
		this.tipo = tipo;
		this.fechaSubida = fechaSubida;
		this.ruta = ruta;
		this.subidaPor = subidaPor;
		this.formacion = formacion;
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

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public User getSubidaPor() {
		return subidaPor;
	}

	public void setSubidaPor(User subidaPor) {
		this.subidaPor = subidaPor;
	}

	public FormacionEmpresa getFormacion() {
		return formacion;
	}

	public void setFormacion(FormacionEmpresa formacion) {
		this.formacion = formacion;
	}

}
