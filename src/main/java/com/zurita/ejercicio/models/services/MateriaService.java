package com.zurita.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zurita.ejercicio.models.dao.IMateria;
import com.zurita.ejercicio.models.entities.Materia;

@Service
public class MateriaService implements IMateriaService{

	@Autowired
	private IMateria dao;
	@Override
	@Transactional
	public void save(Materia mar) {
		dao.save(mar);
	}

	@Override
	@Transactional
	public Materia findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void detele(Integer id) {
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Materia> findByAll() {
		return (List<Materia>) dao.findAll();
	}
}
