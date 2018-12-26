package com.workflow.domain.request.response;

import java.util.UUID;

public class MovimentoRequest {

	private int id_fluxo;
	
	public int getId_fluxo() {
		return id_fluxo;
	}

	public void setId_fluxo(int id_fluxo) {
		this.id_fluxo = id_fluxo;
	}


	public MovimentoRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovimentoRequest(int id_fluxo, int id_fase, String acao, UUID uuid) {
		super();
		this.id_fluxo = id_fluxo;
	}
	
	
}
