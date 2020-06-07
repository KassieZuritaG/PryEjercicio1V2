package com.zurita.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zurita.ejercicio.models.dao.IMatricula;
import com.zurita.ejercicio.models.entities.Matricula;

@Service
public class MatriculaService implements IMatriculaService{

	@Autowired
	private IMatricula dao;

	@Override
	@Transactional
	public void save(Matricula mac) {
		dao.save(mac);
	}

	@Override
	@Transactional
	public Matricula findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void detele(Integer id) {
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Matricula> findByAll() {
		return (List<Matricula>) dao.findAll();
	}
	
	
}
