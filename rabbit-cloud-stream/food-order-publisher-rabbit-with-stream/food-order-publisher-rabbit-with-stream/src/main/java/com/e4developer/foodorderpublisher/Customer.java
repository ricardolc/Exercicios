package com.e4developer.foodorderpublisher;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

	private String nome;
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Customer(String nome, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Customer() {
	}
	
	@Override
	public String toString() {
		return "Client [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
}
