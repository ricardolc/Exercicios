package br.exercicios.generics.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class FilhoDoSenhor {
	public abstract void consulta2();
}


abstract class Animal {
	public abstract void consulta();
}

class Gato extends Animal {

	@Override
	public void consulta() {
		System.out.println("Consultando gato");
	}

}

class Cachorro extends Animal implements Comparable  {

	@Override
	public void consulta() {
		System.out.println("Consultando Cachorro");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class WildCardTest {

	// generics - só existe em tempo de compilacao,
	// existe para garantir que estamos trabalhando sempre com o mesmo tipo
	// wildCard - caracter coringa

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro[] cachorros = { new Cachorro(), new Cachorro() };
		Gato[] gatos = { new Gato(), new Gato() };

		// consultaAnimais (cachorros);
		// consultaAnimais (gatos);

		List<Cachorro> cachorroList = new ArrayList<>();
		cachorroList.add(new Cachorro());

		List<Gato> gatoList = new ArrayList<>();
		gatoList.add(new Gato());

		// consultaAnimaisList(cachorroList); // nao eh possivel pq o metodo nao recebe
		// esse tipo
		List<Animal> animalList = new ArrayList<>();
		animalList.add(new Gato());

		// consultaAnimaisList(animalList);
		consultaAnimaisGenericList(animalList); // ok
		consultaAnimaisGenericList(cachorroList); // ok
		ordenarLista(cachorroList);
		
	}

	public static void consultaAnimais(Animal[] animals) {
		for (Animal animal : animals) {
			animal.consulta(); // aplica-se polimorfismo
		}
	}

	public static void consultaAnimaisList(List<Animal> animals) {

		for (Animal animal : animals) {
			animal.consulta(); // aplica-se polimorfismo
		}

		animals.add(new Cachorro());
		animals.add(new Gato());
	}

	public static void consultaAnimaisGenericList(List<? extends Animal> animals) {
		// ? caracter coringa
		// usado se eu vou apenas executar, nao vou inserir

		for (Animal animal : animals) {
			animal.consulta(); // aplica-se polimorfismo
		}

		// ? extends : estou prometendo que depois eu nao vou inserir
		// pq depois ele nao tera como saber.
		// animals.add (new Animal()); nao pode
		// animals.add (new Cachorro()); nao pode

	}

	public static void consultaCachorroGenericList(List<? super Cachorro> cachorroList) {
		// ? caracter coringa

		// ? super : vou aceitar qualquer lista que seja cachorro ou supertipo de
		// cachorro (ex: animal)

		Cachorro c1 = new Cachorro(); // pode
		Animal animalCachorro = new Cachorro(); // pode
		Object obj = new Cachorro(); // pode
		Animal a; // pode

		cachorroList.add(c1); // pode

		// cachorroList.add(animalCachorro); nao pode
		// cachorroList.add(new Animal()); nao pode

		// cachorroList.add(obj); //nao pode
		// cachorroList.add(new Animal()); nao pode
		// cachorroList.add(a); //nao pode

	}
	
	public static void ordenarLista(List<? extends Comparable> lista) {
		// ? extends Comparable - para ser chamado, o objeto precisa implementar a classe Comparable
		Collections.sort(lista);
		
	}

}
