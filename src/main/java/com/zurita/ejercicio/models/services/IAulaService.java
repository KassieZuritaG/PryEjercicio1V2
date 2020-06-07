package com.zurita.ejercicio.models.services;

import java.util.List;

import com.zurita.ejercicio.models.entities.Aula;

public interface IAulaService {

	public void save(Aula au);
	public Aula findById(Integer id);
	public void detele(Integer id);
	public List<Aula> findByAll();
}
