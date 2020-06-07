package com.zurita.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zurita.ejercicio.models.dao.IAula;
import com.zurita.ejercicio.models.entities.Aula;

@Service
public class AulaService implements IAulaService{

	@Autowired
	private IAula dao;
	
	@Override
	@Transactional
	public void save(Aula au) {
		dao.save(au);
	}

	@Override
	@Transactional
	public Aula findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void detele(Integer id) {
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Aula> findByAll() {
		return (List<Aula>) dao.findAll();
	}

}
