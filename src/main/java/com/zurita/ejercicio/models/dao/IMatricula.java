package com.zurita.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.zurita.ejercicio.models.entities.Matricula;

public interface IMatricula extends CrudRepository<Matricula, Integer>{

}
