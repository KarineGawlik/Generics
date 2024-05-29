package br.com.karineg;

import java.util.ArrayList;
import java.util.List;

//Classe principal para demonstrar o uso das classes Carro, Honda, Ford e Fiat
public class Main {
	 public static void main(String[] args) {
	     // Cria uma lista que pode conter qualquer tipo de Carro
	     List<Carro> listaDeCarros = new ArrayList<>();
	     
	     // Adiciona instâncias de Honda, Ford e Fiat à lista
	     listaDeCarros.add(new Honda("Honda", "Civic"));
	     listaDeCarros.add(new Honda("Honda", "Fit"));

	     listaDeCarros.add(new Ford("Ford", "Fiesta"));
	     listaDeCarros.add(new Ford("Ford", "Focus" ));

	     listaDeCarros.add(new Fiat("Fiat", "Mobi"));
	     listaDeCarros.add(new Fiat("Fiat", "Argo"));

	     
	     // Percorre a lista de carros e exibe as informações de cada carro
	     for (Carro carro : listaDeCarros) {
	         carro.exibirInfo();
	     }
	 }
}
