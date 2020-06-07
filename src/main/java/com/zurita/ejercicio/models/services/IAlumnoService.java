package com.zurita.ejercicio.models.services;

import java.util.List;

import com.zurita.ejercicio.models.entities.Alumno;

public interface IAlumnoService {

	public void save(Alumno a);
	public Alumno findById(Integer id);
	public void detele(Integer id);
	public List<Alumno> findByAll();
	
}
