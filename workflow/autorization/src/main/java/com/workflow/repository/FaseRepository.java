package com.workflow.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.workflow.domain.Fase;

public interface FaseRepository extends CrudRepository<Fase, Serializable> {
	 
    @Query(value = "SELECT * FROM tb_fase where fluxo_id_fluxo=?1 and fl_inicial = true", nativeQuery = true)
    public List<Fase> find_fase_inicial_by_id_fluxo(int id_fluxo);
}