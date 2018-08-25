package com.workflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workflow.domain.PessoaModel;
import com.workflow.endpoint.configuration.ResourceNotFoundException;
import com.workflow.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService{
	
	@Autowired
	private PessoaRepository repository;
	
	
	@Override
	public void save(PessoaModel pessoa) {
		// TODO Auto-generated method stub
		repository.save(pessoa);
		
	}

	@Override
	public void delete(PessoaModel pessoaModel) {
		// TODO Auto-generated method stub
		repository.delete(pessoaModel);
		
	}

	@Override
	public List<PessoaModel> findAll() {
		// TODO Auto-generated method stub
		//return repository.findAll().iterator().;
		return null;
		
	}

	@Override
	public PessoaModel findOne(Integer id) {
		// TODO Auto-generated method stub
		PessoaModel pessoaModel = repository.findOne(id);
		
		if (pessoaModel == null)
			throw new ResourceNotFoundException(new Long(id), "user not found");
		
		return pessoaModel;
		
	}

}
