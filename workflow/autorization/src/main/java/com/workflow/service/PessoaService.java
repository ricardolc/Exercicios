package com.workflow.service;

import java.util.List;

import com.workflow.domain.PessoaModel;

public interface PessoaService {

	void save(PessoaModel pessoa);
	 
	void delete(PessoaModel pessoaModel);
 
	List<PessoaModel> findAll();
 
	PessoaModel findOne(Integer id);
}
