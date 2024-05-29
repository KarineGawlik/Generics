package br.com.karineg;

public class Honda extends Carro {

	//construtor da marca honda
	public Honda(String marca, String modelo) {
		super("Honda", modelo);
	}
	//implementa método da classe abstrata Carro
	@Override
	void exibirInfo() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo);
	}

}
