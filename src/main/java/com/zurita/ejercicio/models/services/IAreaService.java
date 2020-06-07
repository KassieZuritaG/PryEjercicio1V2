package com.zurita.ejercicio.models.services;

import java.util.List;

import com.zurita.ejercicio.models.entities.Area;

public interface IAreaService {

	public void save(Area ar);
	public Area findById(Integer id);
	public void detele(Integer id);
	public List<Area> findByAll();
}
