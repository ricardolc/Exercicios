package com.workflow.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workflow.domain.Pessoa;
import com.workflow.endpoint.configuration.ResourceNotFoundException;
import com.workflow.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService{
	
	@Autowired
	private PessoaRepository repository;
	
	
	@Override
	public void save(Pessoa pessoa) {
		// TODO Auto-generated method stub
		repository.save(pessoa);
		
	}

	@Override
	public void delete(Pessoa pessoaModel) {
		// TODO Auto-generated method stub
		repository.delete(pessoaModel);
		
	}

	@Override
	public List<Pessoa> findAll() {
		// TODO Auto-generated method stub
		//return repository.findAll().iterator().;
		// TODO Auto-generated method stub
		//return repository.findAll().iterator().;
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Iterator<Pessoa> iterator = repository.findAll().iterator();
		while (iterator.hasNext()) {
			pessoas.add(iterator.next());
		}
 
		return pessoas;		
	}

	@Override
	public Pessoa findOne(Integer id) {
		// TODO Auto-generated method stub
		Pessoa pessoaModel = repository.findOne(id);
		
		if (pessoaModel == null)
			throw new ResourceNotFoundException(new Long(id), "user not found");
		
		return pessoaModel;
		
	}

}
