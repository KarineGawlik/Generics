package br.com.karineg;

public class Fiat extends Carro {

	//construtor
	public Fiat(String marca, String modelo) {
		super("Fiat", modelo);
	}
	//implementa método da classe abstrata Carro
	void exibirInfo() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo);
	}

}
