package com.workflow.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "tb_movimento")
@Entity
public class Movimento {

	@Id @GeneratedValue
	@Column(name = "id")	
	private Integer id;
	
	@Column(name = "id_movimento")
	private UUID idMovimento;
	
	@ManyToOne
	private Fase id_fase;
	
	@ManyToOne
	private Status id_status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UUID getIdMovimento() {
		return idMovimento;
	}

	public void setIdMovimento(UUID idMovimento) {
		this.idMovimento = idMovimento;
	}

	public Fase getId_fase() {
		return id_fase;
	}

	public void setId_fase(Fase id_fase) {
		this.id_fase = id_fase;
	}

	public Status getId_status() {
		return id_status;
	}

	public void setId_status(Status id_status) {
		this.id_status = id_status;
	}

	public Movimento(Integer id, UUID idMovimento, Fase id_fase, Status id_status) {
		super();
		this.id = id;
		this.idMovimento = idMovimento;
		this.id_fase = id_fase;
		this.id_status = id_status;
	}

	public Movimento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
