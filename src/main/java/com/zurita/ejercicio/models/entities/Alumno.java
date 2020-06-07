package com.zurita.ejercicio.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno extends Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="identificador")
	private String identificador;

	public Alumno() {
		super();
	}

	public Alumno(Integer id) {
		super();
		this.setIdpersona(id);
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	@OneToMany(mappedBy="estudiante", fetch=FetchType.LAZY) //mappedby debe ser unAtributo en la clase relacionada
	private List<Matricula> matriculas;

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	
	
	

}
