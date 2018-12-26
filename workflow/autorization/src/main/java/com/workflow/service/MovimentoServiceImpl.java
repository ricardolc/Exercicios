package com.workflow.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workflow.domain.Fase;
import com.workflow.domain.Movimento;
import com.workflow.domain.Status;
import com.workflow.domain.request.response.MovimentoRequest;
import com.workflow.repository.FaseRepository;
import com.workflow.repository.MovimentoRepository;


@Service
public class MovimentoServiceImpl implements MovimentoService{
	
	@Autowired
	private MovimentoRepository movimentoRepository;

	@Autowired
	private FaseRepository faseRepository;	
	
	//@Autowired

	
	@Override
	public Movimento save(Movimento s) {
		return movimentoRepository.save(s);
	}

	@Override
	public void delete(Movimento d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Movimento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movimento findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movimento saveMoviment(MovimentoRequest movimentoRequest) {

		int idFluxo = movimentoRequest.getId_fluxo();
		
		List<Fase> fases = faseRepository.find_fase_inicial_by_id_fluxo(idFluxo);
		
		Optional<Fase> fase = fases.stream().findFirst();
		
		UUID idMovimento = com.datastax.driver.core.utils.UUIDs.timeBased();
		
		Movimento movimento = new Movimento();
		
		movimento.setId(1);
		movimento.setIdMovimento(idMovimento);
		
		if (fase.isPresent())
		    movimento.setId_fase(fase.get());
		
		Status status = new Status();
		status.setNomeStatus("Em Andamento");
//		status.setAtivo(true);
		
		movimento.setId_status(status);
		
		movimentoRepository.save(movimento);
		
		

		
		
	
		return null;
		
	}
	

}
