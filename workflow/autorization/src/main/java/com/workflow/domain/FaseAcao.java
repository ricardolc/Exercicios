package com.workflow.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="tb_fase_acao")
@Entity
public class FaseAcao {

	@Id
	@Column(name = "id_fase_acao")
	private Integer idFaseAcao;

	@ManyToOne
	private Fase fase;
	
	@ManyToOne
	private Acao acao;
	@ManyToOne
	
	private Fase FaseDestino;
	@ManyToOne
	
	private Status status;
	
	public FaseAcao() {
	}

	@Column(name = "fl_ativo", columnDefinition = "BIT")
	private boolean ativo;

	public Integer getIdFaseAcao() {
		return idFaseAcao;
	}

	public void setIdFaseAcao(Integer idFaseAcao) {
		this.idFaseAcao = idFaseAcao;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

	public Fase getFaseDestino() {
		return FaseDestino;
	}

	public void setFaseDestino(Fase faseDestino) {
		FaseDestino = faseDestino;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

	public FaseAcao(Integer idFaseAcao, Fase fase, Acao acao, Fase faseDestino, Status status, boolean ativo) {
		super();
		this.idFaseAcao = idFaseAcao;
		this.fase = fase;
		this.acao = acao;
		FaseDestino = faseDestino;
		this.status = status;
		this.ativo = ativo;
	}

	
	
}
