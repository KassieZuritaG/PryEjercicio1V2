package com.zurita.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zurita.ejercicio.models.dao.IArea;
import com.zurita.ejercicio.models.entities.Area;

@Service
public class AreaService implements IAreaService{
	
	@Autowired
	private IArea dao;
	
	@Override
	@Transactional
	public void save(Area ar) {
		dao.save(ar);
	}

	@Override
	@Transactional
	public Area findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void detele(Integer id) {
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Area> findByAll() {
		return (List<Area>) dao.findAll();
	}

}
