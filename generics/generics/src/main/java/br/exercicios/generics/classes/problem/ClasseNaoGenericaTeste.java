package br.exercicios.generics.classes.problem;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTeste {

	public static void main(String[] args) {
		CarroAlugavel carroAlugavel = new CarroAlugavel();
		Carro carroAlugado = carroAlugavel.alugarCarro();
		System.out.println("usando o carro por um mes");

		carroAlugavel.devolverCarro(carroAlugado);
		
		System.out.println(" --------------------- ");
		ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
		Computador computadorAlugado = computadorAlugavel.alugarComputador();
		System.out.println("usando o carro por um mes");

		computadorAlugavel.devolverComputador(computadorAlugado);
	}
}


class CarroAlugavel { 
	private List<Carro> carrosDisponiveis = new ArrayList<>();
	{ // bloco de inicializacao
		carrosDisponiveis.add(new Carro("Gol"));
		carrosDisponiveis.add(new Carro("BMW"));	
	}
	
	
	public Carro alugarCarro() {
		Carro c = carrosDisponiveis.remove(0);
		System.out.println("Alugando Carro" + c);
		System.out.println("Carros Disponiveis" + carrosDisponiveis);

		
		return c;
	}
	
	public void devolverCarro(Carro c) {
		System.out.println("Devolvendo Carro" + c);

		carrosDisponiveis.add(c);
		
		System.out.println("Carros disponiveis" + carrosDisponiveis);
	}	
}	
	
	

class ComputadorAlugavel{ 
	private List<Computador> computadoresDisponiveis = new ArrayList<>();
	{ // bloco de inicializacao
		computadoresDisponiveis.add(new Computador("DEL"));
		computadoresDisponiveis.add(new Computador("HP"));	
	}
	
	
	public Computador alugarComputador() {
		Computador c = computadoresDisponiveis.remove(0);
		System.out.println("Alugando Computador" + c);
		System.out.println("Computadores Disponiveis" + computadoresDisponiveis);

		
		return c;
	}
	
	public void devolverComputador(Computador c) {
		System.out.println("Devolvendo Computador" + c);

		computadoresDisponiveis.add(c);
		
		System.out.println("Computadores disponiveis" + computadoresDisponiveis);
	}	
}