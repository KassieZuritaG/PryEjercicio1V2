package com.zurita.ejercicio.models.services;

import java.util.List;

import com.zurita.ejercicio.models.entities.Semestre;

public interface ISemestreService {

	public void save(Semestre s);
	public Semestre findById(Integer id);
	public void detele(Integer id);
	public List<Semestre> findByAll();
}
