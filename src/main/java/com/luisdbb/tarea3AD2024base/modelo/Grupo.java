package com.luisdbb.tarea3AD2024base.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupo")
public class Grupo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo")
    private int idGrupo;

    private String nombre;
    private String ciclo;
    private int curso;
    private String anioAcademico;

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    private Profesor tutor;

    @OneToMany(mappedBy = "grupo")
    private List<Estudiante> estudiantes;

    public Grupo() {}

	public Grupo(int idGrupo, String nombre, String ciclo, int curso, String anioAcademico, Profesor tutor,
			List<Estudiante> estudiantes) {
		super();
		this.idGrupo = idGrupo;
		this.nombre = nombre;
		this.ciclo = ciclo;
		this.curso = curso;
		this.anioAcademico = anioAcademico;
		this.tutor = tutor;
		this.estudiantes = estudiantes;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getAnioAcademico() {
		return anioAcademico;
	}

	public void setAnioAcademico(String anioAcademico) {
		this.anioAcademico = anioAcademico;
	}

	public Profesor getTutor() {
		return tutor;
	}

	public void setTutor(Profesor tutor) {
		this.tutor = tutor;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
