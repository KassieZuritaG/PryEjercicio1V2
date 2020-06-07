package com.zurita.ejercicio.models.services;

import java.util.List;

import com.zurita.ejercicio.models.entities.Profesor;

public interface IProfesorService {

	public void save(Profesor p);
	public Profesor findById(Integer id);
	public void detele(Integer id);
	public List<Profesor> findByAll();
}
