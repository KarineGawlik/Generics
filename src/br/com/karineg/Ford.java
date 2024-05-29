package br.com.karineg;

public class Ford extends Carro {

	//adiciona construtor 
	public Ford(String marca, String modelo) {
		super("Ford", modelo);
	}
	//implementa método da classe abstrata Carro
	@Override
	void exibirInfo() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo);
	}

}
