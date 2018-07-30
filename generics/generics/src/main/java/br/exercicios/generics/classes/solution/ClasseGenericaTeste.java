package br.exercicios.generics.classes.solution;

import java.util.ArrayList;
import java.util.List;

import br.exercicios.generics.classes.problem.Carro;

public class ClasseGenericaTeste {

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