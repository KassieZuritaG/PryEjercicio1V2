package com.zurita.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zurita.ejercicio.models.dao.IProfesor;
import com.zurita.ejercicio.models.entities.Profesor;

@Service
public class ProfesorService implements IProfesorService{

	@Autowired
	private IProfesor dao;

	@Override
	@Transactional
	public void save(Profesor p) {
		dao.save(p);
	}

	@Override
	@Transactional
	public Profesor findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void detele(Integer id) {
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Profesor> findByAll() {
		return (List<Profesor>) dao.findAll();
	}
}
