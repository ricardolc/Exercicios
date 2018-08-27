package com.workflow.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.workflow.domain.Fase;

public interface FaseRepository extends CrudRepository<Fase, Serializable> {
	 

}