package com.workflow.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.workflow.domain.Fase;
import com.workflow.repository.FaseRepository;



@Service
public class FaseServiceImpl implements FaseService{
	
	@Autowired
	private FaseRepository repository;

	@Override
	public void save(Fase fase) {
		// TODO Auto-generated method stub
		repository.save(fase);
	}

	@Override
	public void delete(Fase fase) {
		// TODO Auto-generated method stub
		repository.delete(fase);
	}

	@Override
	public List<Fase> findAll() {
		// TODO Auto-generated method stub
		
		
		//return Lists.newArrayList(repository.findAll());
		
		List<Fase> fases = new ArrayList<Fase>();
		Iterator<Fase> iterator = repository.findAll().iterator();
		while (iterator.hasNext()) {
			fases.add(iterator.next());
		}
 
		return fases;
		
	}

	@Override
	public Fase findOne(Integer id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
		
	}

}
