package com.workflow.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.workflow.domain.PessoaModel;
 
public interface PessoaRepository extends CrudRepository<PessoaModel, Serializable> {
 

}