package com.workflow.service;

import java.util.List;

import com.workflow.domain.Pessoa;

public interface PessoaService {

	void save(Pessoa pessoa);
	 
	void delete(Pessoa pessoaModel);
 
	List<Pessoa> findAll();
 
	Pessoa findOne(Integer id);
}
