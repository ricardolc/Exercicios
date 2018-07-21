package br.exercicios.generics.problem;

import java.util.ArrayList;
import java.util.List;

public class GenericTestProblem {

	public static void main(String[] args) {
		List lista = new ArrayList();
		
		lista.add("string");
		lista.add(1);
		lista.add(new Consumidor(1, "Teste"));
		
		
		for (Object obj: lista) {
			
			if (obj instanceof String) 
			   System.out.println("String " + obj.toString());
			if (obj instanceof Integer) 
			   System.out.println("int " + obj.toString());
			if (obj instanceof Consumidor) {
			   Consumidor c = (Consumidor) obj;
			   System.out.println("Consumidor " + c.toString());
			}

		}
	}
}
