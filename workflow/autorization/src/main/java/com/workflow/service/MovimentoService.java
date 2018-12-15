package com.workflow.service;

import java.util.List;

import com.workflow.domain.Movimento;
import com.workflow.domain.request.response.MovimentoRequest;

public interface MovimentoService {
	
	Movimento save(Movimento s);
	 
	void delete(Movimento d);
 
	List<Movimento> findAll();
 
	Movimento findOne(Integer id);

	Movimento saveMoviment(MovimentoRequest movimentoRequest);

}
