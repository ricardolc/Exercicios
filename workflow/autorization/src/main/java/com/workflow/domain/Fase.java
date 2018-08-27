package com.workflow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Table(name="tb_fase")
@Entity
public class Fase {

	public Integer getIdFase() {
		return idFase;
	}

	public void setIdFase(Integer idFase) {
		this.idFase = idFase;
	}

	public Fluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(Fluxo fluxo) {
		this.fluxo = fluxo;
	}

	public String getNomeFase() {
		return nomeFase;
	}

	public void setNomeFase(String nomeFase) {
		this.nomeFase = nomeFase;
	}

	public boolean isFaseInicial() {
		return faseInicial;
	}

	public void setFaseInicial(boolean faseInicial) {
		this.faseInicial = faseInicial;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Id
	@Column(name="id_fase")
	private Integer idFase;

	@ManyToOne
	private Fluxo fluxo;

	@Column(name="nm_fase")
	private String nomeFase;
		
	@Column(name = "fl_inicial", columnDefinition = "BIT")
	private boolean faseInicial;	
	
	@Column(name = "fl_ativo", columnDefinition = "BIT")
	private boolean ativo;
}
