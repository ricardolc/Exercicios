package com.e4developer.foodorderpublisher;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Client {

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
	public Client(String nome, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Client() {
	}
	
	@Override
	public String toString() {
		return "Client [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
}
