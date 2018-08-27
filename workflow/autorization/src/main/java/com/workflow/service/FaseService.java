package com.workflow.service;

import java.util.List;
import com.workflow.domain.Fase;

public interface FaseService {

	void save(Fase fase);

	void delete(Fase fase);

	List<Fase> findAll();

	Fase findOne(Integer id);
}
