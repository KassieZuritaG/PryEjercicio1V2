package com.zurita.ejercicio.models.services;

import java.util.List;

import com.zurita.ejercicio.models.entities.Materia;

public interface IMateriaService {

	public void save(Materia mar);
	public Materia findById(Integer id);
	public void detele(Integer id);
	public List<Materia> findByAll();
}
