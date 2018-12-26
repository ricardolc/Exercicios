package com.workflow.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.workflow.domain.Pessoa;
 
public interface PessoaRepository extends CrudRepository<Pessoa, Serializable> {
 
	Pessoa findOne(int id);

}