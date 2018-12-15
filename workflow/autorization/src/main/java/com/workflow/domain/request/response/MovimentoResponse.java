package com.workflow.domain.request.response;

import java.util.UUID;

import com.workflow.domain.Fase;
import com.workflow.domain.Status;

public class MovimentoResponse {
	private UUID idMovimento;
	private Fase fase;
	private Status status;
	public UUID getIdMovimento() {
		return idMovimento;
	}
	public void setIdMovimento(UUID idMovimento) {
		this.idMovimento = idMovimento;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public MovimentoResponse(UUID idMovimento, Fase fase, Status status) {
		super();
		this.idMovimento = idMovimento;
		this.fase = fase;
		this.status = status;
	}
	
	
}
