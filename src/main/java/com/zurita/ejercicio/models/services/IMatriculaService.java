package com.zurita.ejercicio.models.services;

import java.util.List;

import com.zurita.ejercicio.models.entities.Matricula;

public interface IMatriculaService {

	public void save(Matricula mac);
	public Matricula findById(Integer id);
	public void detele(Integer id);
	public List<Matricula> findByAll();
}
