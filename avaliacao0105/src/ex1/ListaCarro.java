package ex1;

import java.util.HashMap;

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
		
		
	}

}
