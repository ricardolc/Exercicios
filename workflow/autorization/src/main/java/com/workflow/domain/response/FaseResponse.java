package com.workflow.domain.response;

import com.workflow.domain.Fluxo;

import lombok.Data;

@Data
public class FaseResponse {
	private Integer idFase;
	private Fluxo fluxo;
	private String nomeFase;
	private boolean faseInicial;	
	private boolean ativo;	
	
	public FaseResponse() {
	}
	
	public FaseResponse(Integer idFase, Fluxo fluxo, String nomeFase, boolean faseInicial, boolean ativo) {
		this.idFase = idFase;
		this.fluxo = fluxo;
		this.nomeFase = nomeFase;
		this.faseInicial = faseInicial;
		this.ativo = ativo;
	}


}
