package com.luisdbb.tarea3AD2024base.modelo;

import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
@DiscriminatorValue("TUTOR_EMPRESA")
public class TutorEmpresa extends User {


    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @OneToMany(mappedBy = "tutorEmpresa")
    private List<FormacionEmpresa> formaciones;

    public TutorEmpresa() {
        super();
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
