package br.exercicios.generics.classes.problem;

public class Computador {
	private String nome;

	public Computador(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
		

}
