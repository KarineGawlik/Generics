package br.com.karineg;

//criando a classe abstrata de carro, essa classe vai ser o modelo de base para todos os carros da lista
public abstract class Carro {
	//atributo comum para todos os carros
	String marca;
	String modelo;

	//Construtor da marca e modelo do carro
	public Carro(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	//método para exibir informaçõees do carro 
	abstract void exibirInfo();
}
