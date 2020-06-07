package com.zurita.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.zurita.ejercicio.models.entities.Persona;

public interface IPersona extends CrudRepository<Persona, Integer>{

}
