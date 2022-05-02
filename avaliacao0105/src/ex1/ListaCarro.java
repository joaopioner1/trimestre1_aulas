package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ListaCarro {

	public static void main(String[] args) {
		// Author: João Vítor Souza Pioner / Date: 02/05/2022

		//-------exercicio 1------------
		
		HashMap<String, String> carros = new HashMap<>();
		// Instanciando variaveis da classe
		Carro car1 = new Carro("Tucson", "Hyndai", "SUV");
		Carro car2 = new Carro("Uno", "Fiat", "Popular");
		Carro car3 = new Carro("Corolla", "Toyota", "Sedan");
		Carro car4 = new Carro("Clio", "Ranault", "Popular");
		Carro car5 = new Carro("Montana", "Chevrolet", "Trabalho");

		carros.put(car1.getMarca(), car1.getNome());
		carros.put(car2.getMarca(), car2.getNome());
		carros.put(car3.getMarca(), car3.getNome());
		carros.put(car4.getMarca(), car4.getNome());
		carros.put(car5.getMarca(), car5.getNome());

		int i = 0;
		for (String aux : carros.keySet()) {
			i++;
			System.out.println(i + " - Marca: " + aux + "| Nome: " + carros.get(aux));
		}
		
		//-------exercicio 2------------
		System.out.println("\nEXERCICIO 2");
		List<String> lista = new ArrayList<>();
		lista.add(car1.getNome());
		lista.add(car2.getNome());
		lista.add(car3.getNome());
		lista.add(car4.getNome());
		lista.add(car5.getNome());
		Collections.sort(lista, Collections.reverseOrder());
		System.out.println(lista);
		
		//-------exercicio 2------------
		System.out.println("\nEXERCICIO 3");
		ArrayList<Carro> arrayCarros = new ArrayList<>();
		arrayCarros.add(car1);
		arrayCarros.add(car2);
		arrayCarros.add(car3);
		arrayCarros.add(car4);
		arrayCarros.add(car5);
		for (Carro c : arrayCarros) {
			System.out.println(c);
		}
	}

}
