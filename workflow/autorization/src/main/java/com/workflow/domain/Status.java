package com.workflow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_status")
@Entity
public class Status {
	
	@Id
	@Column(name = "nm_status")
	private String nomeStatus;

	@Column(name = "fl_ativo", columnDefinition = "BIT")
	private boolean ativo;

	public Status() {
	}

	public Status(String nomeStatus, boolean ativo) {
		this.nomeStatus = nomeStatus;
		this.ativo = ativo;
	}

	public String getNomeStatus() {
		return nomeStatus;
	}

	public void setNomeStatus(String nomeStatus) {
		this.nomeStatus = nomeStatus;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
