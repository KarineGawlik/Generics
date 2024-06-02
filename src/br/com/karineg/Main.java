package br.com.karineg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Classe principal para demonstrar o uso das classes Carro, Honda, Ford e Fiat
public class Main {
	 public static void main(String[] args) {
	     // Cria uma lista que pode conter qualquer tipo de Carro
	     List<Carro> listaDeCarros = new ArrayList<>();
	     
	     CarFactory fiatFactory = new fiatFactory();
	     CarFactory fordFactory = new fordFactory();
	     CarFactory hondaFactory = new hondaFactory();
	     
	     // Adiciona instâncias de Honda, Ford e Fiat à lista
	     listaDeCarros.add(fiatFactory.criarCarro("Mobi", "Hatch"));
	     listaDeCarros.add(fiatFactory.criarCarro("Argo", "Sedan"));
	     listaDeCarros.add(fiatFactory.criarCarro("Pulse", "SUV"));
	     
	     listaDeCarros.add(fordFactory.criarCarro("Fiesta", "Hatch"));
	     listaDeCarros.add(fordFactory.criarCarro("Focus", "Sedan" ));
	     listaDeCarros.add(fordFactory.criarCarro("EcoSport", "SUV" ));

	     listaDeCarros.add(hondaFactory.criarCarro("Civic", "Sedan"));
	     listaDeCarros.add(hondaFactory.criarCarro("Fit", "Hatch"));
	     listaDeCarros.add(hondaFactory.criarCarro("CR-V", "SUV"));
	     
	     //Para agrupar os carros por marca, pode usar o mapeamento das marcas para as listas de seus respsctivos carros, assim, vai usar a Lista, Map e HashMap para fazer isso
	     //Cria "map" chamado carrosPorMarca, que recebe uma chave tipo String, no caso, marca do carro, o "List<Carro>" faz uma lista de carros com a marca e o "HashMap" é uma implementação do Map que permite armazenar os valores 
	     Map<String, List<Carro>> carrosPorMarca = new HashMap<>();
	     //O loop for itera cada carro na lista, "carro.marca" é a chave usada no mapa
	     for (Carro carro : listaDeCarros) {
	    	 //computeIfAbsent é um método que verifica se a chave, carro.marca, já existe no mapa, se a chave não existir, cria uma nova entrada com essa chave e uma nova lista newArrayList e retorna a lista associada a chave e adiciona o carro 
	    	 carrosPorMarca.computeIfAbsent(carro.marca, k -> new ArrayList<>()).add(carro);
	     }
	     
	     //Imprime os carros separados pela marca
	     //usa um loop para iterar sobre cada entry no carrosPorMarca, entry.getKey retorna a chave (marca do carro) da entrada atual
	     for (Map.Entry<String, List<Carro>> entry : carrosPorMarca.entrySet()) {
	    	 System.out.println(entry.getKey().toUpperCase());
	    	 for (Carro carro : entry.getValue()) {
	    		 carro.exibirInfo();
	    	 }
	    	 System.out.println();
	     }
	 }
}
