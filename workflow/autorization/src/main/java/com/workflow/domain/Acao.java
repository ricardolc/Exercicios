package com.workflow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_acao")
@Entity
public class Acao {

	@Id
	@Column(name = "nm_acao")
	private String nomeAcaos;

	@Column(name = "fl_ativo", columnDefinition = "BIT")
	private boolean ativo;
	
}
